package com.imic.app.imic;



import org.codehaus.jackson.annotate.JsonIgnore;
import java.util.Collection;
import java.util.HashSet;




public class Expert extends User {

	
	private double rating;


	public Expert() {
		super();

		insuranceCompanies = new HashSet<InsuranceCompany>();
		incidences = new HashSet<Incidence>();
	}
	

	public double getRating() {
		
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	private Collection<InsuranceCompany> insuranceCompanies;
	private Collection<Incidence> incidences;
	
	@JsonIgnore
	public Collection<InsuranceCompany> getInsuranceCompanies() {
		return insuranceCompanies;
	}

	public void setInsuranceCompanies(Collection<InsuranceCompany> insuranceCompanies) {
		this.insuranceCompanies = insuranceCompanies;
	}
	
	@JsonIgnore
	public Collection<Incidence> getIncidences() {
		return incidences;
	}

	public void setIncidences(Collection<Incidence> incidences) {
		this.incidences = incidences;
	}
	
	

}
