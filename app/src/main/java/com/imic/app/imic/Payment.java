package com.imic.app.imic;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;


public class Payment extends DomainEntity {

	private String concept;
	private Double totalAmount;
	private Date moment;
	

	public Payment() {
		super();

		insuranceCompanies = new HashSet<InsuranceCompany>();

	}
	

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}
	

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount= totalAmount;
	}
	

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	private Admin admin;
	private Collection<InsuranceCompany> insuranceCompanies;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Collection<InsuranceCompany> getInsuranceCompanies() {
		return insuranceCompanies;
	}

	public void setInsuranceCompanies(Collection<InsuranceCompany> insuranceCompanies) {
		this.insuranceCompanies = insuranceCompanies;
	}

}
