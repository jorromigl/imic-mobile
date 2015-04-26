package com.imic.app.imic;

import java.util.Date;




public class Compensation extends DomainEntity{
	
	private String concept;
	private Double totalAmount;
	private Date moment;
	
	
	public Compensation(){
		super();

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
	
	private InsuredPerson insuredPerson;
	private InsuranceCompany insuranceCompany;
	

	public InsuredPerson getInsuredPerson() {
		return insuredPerson;
	}

	public void setInsuredPerson(InsuredPerson insuredPerson) {
		this.insuredPerson = insuredPerson;
	}

	public InsuranceCompany getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	
}
