package com.imic.app.imic;
import java.util.Collection;
import java.util.HashSet;



public class RepairCompany extends User {

	private Double rating;
	

	public RepairCompany() {
		super();

		insuranceCompanies = new HashSet<InsuranceCompany>();
		incidences = new HashSet<Incidence>();
	}


	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	private Collection<InsuranceCompany> insuranceCompanies;
	private Collection<Incidence> incidences;
	

	public Collection<InsuranceCompany> getInsuranceCompanies() {
		return insuranceCompanies;
	}

	public void setInsuranceCompanies(Collection<InsuranceCompany> insuranceCompanies) {
		this.insuranceCompanies = insuranceCompanies;
	}
	
	public void addInsuranceCompany(InsuranceCompany insuranceCompany)
	{
		insuranceCompanies.add(insuranceCompany);
		
	}
	public void removeInsuranceCompany(InsuranceCompany insuranceCompany)
	{
		insuranceCompanies.remove(insuranceCompany);
		
	}

	public Collection<Incidence> getIncidences() {
		return incidences;
	}

	public void setIncidences(Collection<Incidence> incidences) {
		this.incidences = incidences;
	}
	
	

}
