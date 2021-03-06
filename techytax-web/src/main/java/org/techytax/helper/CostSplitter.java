/**
 * Copyright 2013 Hans Beemsterboer
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

import org.techytax.domain.Cost;

public class CostSplitter {
	
	public static void splitPercentagFromAmount(Cost cost, int percentage) {
		BigDecimal originalAmount = cost.getAmount();
		BigDecimal splitAmount = cost.getAmount();
		splitAmount = new BigDecimal(originalAmount.doubleValue() / ((100 + percentage) / 100d));
		splitAmount = AmountHelper.round(splitAmount);
		cost.setAmount(splitAmount);
		cost.setVat(originalAmount.subtract(splitAmount));
	}
	
	public static void applyPercentage(Cost cost, int percentage) {
		BigDecimal splitAmount = new BigDecimal(cost.getAmount().doubleValue() * (percentage / 100d));
		splitAmount = AmountHelper.round(splitAmount);
		BigDecimal splitVat = new BigDecimal(cost.getVat().doubleValue() * (percentage / 100d));
		splitVat = AmountHelper.round(splitVat);		
		cost.setAmount(splitAmount);
		cost.setVat(splitVat);
	}	
	
	public static void main(String[] args) {
		Cost cost = new Cost();
		cost.setAmount(new BigDecimal("10"));
		splitPercentagFromAmount(cost, 19);
		System.out.println(cost.getAmount());
		System.out.println(cost.getVat());
		applyPercentage(cost, 8);
		System.out.println(cost.getAmount());
		System.out.println(cost.getVat());
	}

}
