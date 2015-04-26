/* Authority.java
 *
 * Copyright (C) 2013 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 * 
 */

package com.imic.app.imic;

import java.util.ArrayList;
import java.util.Collection;



public class Authority {

	// Constructors -----------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public Authority() {
		super();
	}

	// Values -----------------------------------------------------------------

	public static final String ADMIN = "ADMIN";
	public static final String INSURANCECOMPANY = "INSURANCECOMPANY";
	public static final String INSUREDPERSON = "INSUREDPERSON";
	public static final String EXPERT = "EXPERT";
	public static final String REPAIRCOMPANY = "REPAIRCOMPANY";
	

	// Attributes -------------------------------------------------------------

	private String authority;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	// Equality ---------------------------------------------------------------

	@Override
	public int hashCode() {
		return this.getAuthority().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		boolean result;

		if (this == other)
			result = true;
		else if (other == null)
			result = false;
		else if (!this.getClass().isInstance(other))
			result = false;
		else
			result = (this.getAuthority().equals(((Authority) other).getAuthority()));

		return result;
	}

}
