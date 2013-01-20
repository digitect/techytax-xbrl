/**
 * Copyright 2011 Hans Beemsterboer
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
import java.math.BigInteger;
import java.util.List;

import org.techytax.dao.FiscalDao;
import org.techytax.domain.Activum;
import org.techytax.domain.BalanceType;
import org.techytax.domain.Cost;

public class InvestmentDeductionHelper {

	public static BigInteger getInvestmentDeduction(List<Cost> costList, long userId) throws Exception {
		BigDecimal totalInvestment = new BigDecimal("0");
		FiscalDao fiscaalDao = new FiscalDao();
		for (Cost cost : costList) {
			Activum activum = new Activum();
			activum.setUserId(userId);
			activum.setCostId(cost.getId());
			activum = fiscaalDao.getActivumByCostId(activum);
			if (activum != null && activum.getBalanceType() == BalanceType.MACHINERY) {
				totalInvestment = totalInvestment.add(cost.getAmount());
			}
		}
		return calculateInvestmentDeduction(totalInvestment);
	}

	private static BigInteger calculateInvestmentDeduction(BigDecimal totalInvestment) {
		BigInteger totalInvestmentRounded = totalInvestment.setScale(0, BigDecimal.ROUND_UP).toBigInteger();
		if (totalInvestmentRounded.compareTo(new BigInteger("2300")) == -1 || totalInvestmentRounded.compareTo(new BigInteger("306931")) == 1) {
			return new BigInteger("0");
		}
		if (totalInvestmentRounded.compareTo(new BigInteger("2301")) == 1 && totalInvestmentRounded.compareTo(new BigInteger("55248")) == -1) {
			return new BigDecimal(totalInvestmentRounded).multiply(new BigDecimal(".28")).setScale(0, BigDecimal.ROUND_UP).toBigInteger();
		}
		if (totalInvestmentRounded.compareTo(new BigInteger("55249")) == 1 && totalInvestmentRounded.compareTo(new BigInteger("102311")) == -1) {
			return new BigInteger("15470");
		}
		if (totalInvestmentRounded.compareTo(new BigInteger("102312")) == 1 && totalInvestmentRounded.compareTo(new BigInteger("306931")) == -1) {
			return new BigInteger("15470").subtract(new BigDecimal(totalInvestmentRounded.subtract(new BigInteger("102311"))).multiply(new BigDecimal(".0756")).setScale(0, BigDecimal.ROUND_UP)
					.toBigInteger());
		}
		return null;
	}

}
