package com.imic.app.imic;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import org.codehaus.jackson.annotate.JsonIgnore;


public class Policy extends DomainEntity{
	
	private String number;
	private String referenceNumber;
	private Date startMoment;
	private Date endMoment;
	private String conditions;
	
	
	public Policy(){
		super();
		incidences=new HashSet<Incidence>();
	}
	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	

	public Date getStartMoment() {
		return startMoment;
	}

	public void setStartMoment(Date startMoment) {
		this.startMoment = startMoment;
	}
	

	public Date getEndMoment() {
		return endMoment;
	}

	public void setEndMoment(Date endMoment) {
		this.endMoment = endMoment;
	}
	

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	
	private InsuranceCompany insuranceCompany;
	private InsuredPerson insuredPerson;
	private Collection<Incidence>incidences;
	
	@JsonIgnore
	public InsuranceCompany getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	
	@JsonIgnore
	public InsuredPerson getInsuredPerson() {
		return insuredPerson;
	}

	public void setInsuredPerson(InsuredPerson insuredPerson) {
		this.insuredPerson = insuredPerson;
	}

	@JsonIgnore
	public Collection<Incidence> getIncidences() {
		return incidences;
	}


	public void setIncidences(Collection<Incidence> incidences) {
		this.incidences = incidences;
	}
	
	
	
	

}
