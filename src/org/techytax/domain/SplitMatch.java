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
package org.techytax.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "splitmatch_private") 
public class SplitMatch {
	
	@Id
	private long id;

	@Column(name = "kostmatch_id")
	private long kostmatchId;

	private int percentage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getKostmatchId() {
		return kostmatchId;
	}

	public void setKostmatchId(long kostmatchId) {
		this.kostmatchId = kostmatchId;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}


}
