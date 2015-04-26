package com.imic.app.imic;




public class AssessmentIncidence extends DomainEntity{
	
	
	private String comment;
	private Integer ratingInsuranceCompany;
	private Integer ratingExpert;
	private Integer ratingRepairCompany;
	
	public AssessmentIncidence(){
		super();		
	}
	
	

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	

	public Integer getRatingInsuranceCompany() {
		return ratingInsuranceCompany;
	}


	public void setRatingInsuranceCompany(Integer ratingInsuranceCompany) {
		this.ratingInsuranceCompany = ratingInsuranceCompany;
	}


	public Integer getRatingExpert() {
		return ratingExpert;
	}


	public void setRatingExpert(Integer ratingExpert) {
		this.ratingExpert = ratingExpert;
	}


	public Integer getRatingRepairCompany() {
		return ratingRepairCompany;
	}


	public void setRatingRepairCompany(Integer ratingRepairCompany) {
		this.ratingRepairCompany = ratingRepairCompany;
	}
	
	//----Relationships----------------------------------------------------

	private Incidence incidence;

	public Incidence getIncidence() {
		return incidence;
	}

	public void setIncidence(Incidence incidence) {
		this.incidence = incidence;
	}
}
