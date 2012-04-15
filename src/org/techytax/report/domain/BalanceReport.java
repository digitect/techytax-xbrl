/**
 * Copyright 2012 Hans Beemsterboer
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
package org.techytax.report.domain;

import java.math.BigInteger;
import java.util.List;

public class BalanceReport {

	private List<ReportBalance> balanceList;
	private BigInteger totalBeginValue;
	private BigInteger totalEndValue;

	public List<ReportBalance> getBalanceList() {
		return balanceList;
	}

	public void setActiva(List<ReportBalance> balanceList) {
		this.balanceList = balanceList;
	}

	public BigInteger getTotalBeginValue() {
		return totalBeginValue;
	}

	public void setTotalBeginValue(BigInteger totalBeginValue) {
		this.totalBeginValue = totalBeginValue;
	}

	public BigInteger getTotalEndValue() {
		return totalEndValue;
	}

	public void setTotalEndValue(BigInteger totalEndValue) {
		this.totalEndValue = totalEndValue;
	}
}