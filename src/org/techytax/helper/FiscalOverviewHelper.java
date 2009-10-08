/**
 * Copyright 2009 Hans Beemsterboer
 * 
 * This file is part of the TechyTax program.
 *
 * TechyTax is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * TechyTax is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TechyTax; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.techytax.helper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.techytax.dao.BoekDao;
import org.techytax.dao.BoekwaardeDao;
import org.techytax.dao.FiscaalDao;
import org.techytax.domain.Activa;
import org.techytax.domain.Aftrekpost;
import org.techytax.domain.Balans;
import org.techytax.domain.Boekwaarde;
import org.techytax.domain.FiscalOverview;
import org.techytax.domain.Kost;
import org.techytax.domain.KostConstanten;
import org.techytax.domain.Liquiditeit;
import org.techytax.domain.Passiva;
import org.techytax.domain.PriveOnttrekking;
import org.techytax.props.PropsFactory;
import org.techytax.util.DateHelper;

public class FiscalOverviewHelper {

	public static FiscalOverview createFiscalOverview(String beginDatum,
			String eindDatum, List<Kost> boekingen) throws Exception {

		// Load properties
		Properties props = PropsFactory.loadProperties();

		FiscalOverview overzicht = new FiscalOverview();
		PriveOnttrekking onttrekking = new PriveOnttrekking();
		Liquiditeit liquiditeit = null;

		int forLimiet = KostConstanten.MAXIMALE_FOR;
		Date datum = DateHelper.stringToDate(beginDatum);
		int jaar = DateHelper.getJaar(datum);

		// Maak winst-en-verlies rekening op
		Balans btwBalans = BalanceCalculator.calculateBtwBalance(boekingen);

		BoekDao boekDao = new BoekDao();
		List<Aftrekpost> aftrekpostenLijst = boekDao.getDeductableCosts(
				beginDatum, eindDatum);
		overzicht.setJaar(jaar);
		overzicht.setNettoOmzet(btwBalans.getNettoOmzet().intValue());
		
		// Business car costs
		BigDecimal afschrijvingAuto = BalanceCalculator.getAfschrijvingAuto(aftrekpostenLijst);
		if (afschrijvingAuto != null) {
			overzicht.setAfschrijvingAuto(afschrijvingAuto.intValue());
			overzicht.setBijtellingAuto(BalanceCalculator.getFiscaleBijtelling(aftrekpostenLijst)
					.intValue());
			overzicht.setKostenAuto(BalanceCalculator.getKostenVoorAuto(aftrekpostenLijst)
					.intValue());
			List<Kost> corrections = boekDao.getVatCorrectionDepreciation(beginDatum, eindDatum);
			Iterator<Kost> iterator = corrections.iterator();
			int depreciationCorrection = 0;
			while (iterator.hasNext()) {
				Kost correctionKost = iterator.next();
				if (correctionKost.getOmschrijving().contains("auto")) {
					overzicht.setAfschrijvingAutoCorrectie(correctionKost.getBedrag().intValue());
				} else {
					depreciationCorrection += correctionKost.getBedrag().intValue();
				}
			}
			overzicht.setAfschrijvingOverigCorrectie(depreciationCorrection);
			int kostenAutoAftrekbaar = 0;
			kostenAutoAftrekbaar = overzicht.getBijtellingAuto() - overzicht.getAfschrijvingAuto() + overzicht.getAfschrijvingAutoCorrectie() - overzicht.getKostenAuto();
			if (kostenAutoAftrekbaar > 0) {
				kostenAutoAftrekbaar = 0;
			}
			overzicht.setKostenAutoAftrekbaar(kostenAutoAftrekbaar);
		}
		BigDecimal depreciationOther = BalanceCalculator.getOverigeAfschrijvingen(aftrekpostenLijst);
		if (depreciationOther != null) {
			overzicht.setAfschrijvingOverig(BalanceCalculator.getOverigeAfschrijvingen(
					aftrekpostenLijst).intValue());
		}

		overzicht.setKostenOverigTransport(BalanceCalculator.getReiskosten(aftrekpostenLijst)
				.intValue());
		overzicht.setKostenOverig(BalanceCalculator.getEtenskosten(aftrekpostenLijst).add(
				BalanceCalculator.getAlgemeneKosten(aftrekpostenLijst)).intValue());
		overzicht.setWinst(berekenWinst(overzicht));
		int maximaleFor = (int) (overzicht.getWinst() * KostConstanten.FOR_PERCENTAGE);
		System.out.println("Maximale FOR: " + maximaleFor);
		if (maximaleFor > forLimiet) {
			maximaleFor = forLimiet;
		}
		overzicht.setOudedagsReserveMaximaal(maximaleFor);

		// Maak activa balans op.

		// Bereken liquide middelen.
		BoekwaardeDao boekwaardeDao = new BoekwaardeDao();
		Boekwaarde boekwaarde = new Boekwaarde();
		boekwaarde.setBalansId(Activa.CURRENT_ASSETS);
		boekwaarde.setJaar(jaar);
		boekwaarde = boekwaardeDao.getBoekwaardeDitJaar(boekwaarde);

		onttrekking.setBalansSaldo(0);
		// Alleen voor het eerste boekjaar??
		if (boekwaarde == null) {
			String startDate = props.getProperty("start.date");
			List<Kost> rekeningLijst = boekDao.getKostLijst(startDate,
					eindDatum, "rekeningBalans");
			liquiditeit = BalanceCalculator.calculatAccountBalance(rekeningLijst);

			int saldo = liquiditeit.getRekeningBalans().intValue();
			saldo += liquiditeit.getSpaarBalans().intValue();
			boekwaarde = new Boekwaarde();
			boekwaarde.setJaar(jaar);
			boekwaarde.setBalansId(Activa.CURRENT_ASSETS);
			boekwaarde.setSaldo(saldo);

			boekwaardeDao.insertBoekwaarde(boekwaarde);
		} else {
			Boekwaarde vorigeBoekwaarde = boekwaardeDao.getVorigeBoekwaarde(boekwaarde);
			List<Kost> rekeningLijst = boekDao.getKostLijst(beginDatum,
					eindDatum, "rekeningBalans");
			liquiditeit = BalanceCalculator.calculatAccountBalance(rekeningLijst);
			if (vorigeBoekwaarde != null) {
				onttrekking.setBalansSaldo(boekwaarde.getSaldo()-vorigeBoekwaarde.getSaldo());
			} else {
				onttrekking.setBalansSaldo(boekwaarde.getSaldo());
			}
		}
		FiscaalDao fiscaalDao = new FiscaalDao();
		List<Activa> activaLijst = fiscaalDao.getActivaLijst(Integer
				.toString(jaar));

		if (!checkActivaOpgegeven(activaLijst, jaar)) {
			throw new Exception("errors.fiscal.activa");
		}
		overzicht.setActiva(activaLijst);

		// Maak passiva balans op.

		// Voer dezelfde FOR op.
		boekwaarde = new Boekwaarde();
		boekwaarde.setBalansId(Passiva.PENSION);
		boekwaarde.setJaar(jaar);
		boekwaarde = boekwaardeDao.getBoekwaardeDitJaar(boekwaarde);
		int FOR = 0;
		if (boekwaarde == null) {
			boekwaarde = new Boekwaarde();
			boekwaarde.setBalansId(Passiva.PENSION);
			boekwaarde.setJaar(jaar);
			boekwaarde = boekwaardeDao.getVorigeBoekwaarde(boekwaarde);

			if (boekwaarde != null) {
				FOR = boekwaarde.getSaldo();
				boekwaarde.setId(0);
				boekwaarde.setJaar(jaar);
				boekwaardeDao.insertBoekwaarde(boekwaarde);
			}
		}
		// Voer eigen vermogen op.
		boekwaarde = new Boekwaarde();
		boekwaarde.setBalansId(Passiva.NON_CURRENT_ASSETS);
		boekwaarde.setJaar(jaar);
		boekwaarde = boekwaardeDao.getBoekwaardeDitJaar(boekwaarde);
		if (boekwaarde == null) {
			boekwaarde = new Boekwaarde();
			boekwaarde.setBalansId(Passiva.NON_CURRENT_ASSETS);
			boekwaarde.setJaar(jaar);
			boekwaarde.setSaldo(getBalansTotaal(activaLijst, jaar) - FOR);
			boekwaardeDao.insertBoekwaarde(boekwaarde);
		}
		List<Passiva> passivaLijst = fiscaalDao.getPassivaLijst(Integer
				.toString(jaar));
		overzicht.setPassiva(passivaLijst);

		// Vul prive onttrekking in
		Balans kostBalans = BalanceCalculator.calculatCostBalance(boekingen);
		onttrekking.setTotalCost(kostBalans.getTotaleKosten().intValue());
		if (liquiditeit != null) {
			onttrekking.setOpnameSaldo(liquiditeit.getPriveBalans().intValue());
		}
		Integer belastingKosten = boekDao.getBelastingKosten(beginDatum,
				eindDatum);
		if (belastingKosten != null) {
			onttrekking.setVoorlopigeAanslag(belastingKosten);
			onttrekking.setTeruggave(boekDao.getBelastingTeruggave(beginDatum,
					eindDatum));
		}
		overzicht.setOnttrekking(onttrekking);
		return overzicht;
	}

	private static int getBalansTotaal(List<Activa> activaLijst, int fiscaalJaar) {
		Iterator<Activa> iterator = activaLijst.iterator();
		int totaal = 0;
		while (iterator.hasNext()) {
			Activa activa = iterator.next();
			if (activa.getBoekjaar() == fiscaalJaar) {
				totaal += activa.getSaldo().intValue();
			}
		}
		return totaal;
	}

	private static boolean checkActivaOpgegeven(List<Activa> activaLijst,
			int fiscaalJaar) {
		Iterator<Activa> iterator = activaLijst.iterator();
		while (iterator.hasNext()) {
			Activa activa = iterator.next();
			if (activa.getBoekjaar() == fiscaalJaar) {
				return true;
			}
		}
		return false;
	}
	
	public static int berekenWinst(FiscalOverview overzicht) {
		int nettoOmzet = overzicht.getNettoOmzet();
		nettoOmzet += overzicht.getKostenAutoAftrekbaar();
		nettoOmzet -= overzicht.getKostenOverigTransport();
		nettoOmzet -= overzicht.getKostenOverig();
		nettoOmzet -= overzicht.getAfschrijvingOverig();
		nettoOmzet += overzicht.getAfschrijvingOverigCorrectie();
		return nettoOmzet;
	}	
}