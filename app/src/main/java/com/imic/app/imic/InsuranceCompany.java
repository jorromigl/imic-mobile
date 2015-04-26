package com.imic.app.imic;
import java.util.Collection;

import java.util.Date;
import java.util.HashSet;


public class InsuranceCompany extends User{

	private String service;
	private Date entryMoment;
	private Date endMoment;
	private Double rating;
	@SuppressWarnings("unused")
	private String fullName;
	
	public InsuranceCompany(){
		super();
		
		repairCompanies= new HashSet<RepairCompany>();
		payments= new HashSet<Payment>();
		experts = new HashSet<Expert>();
		compensations= new HashSet<Compensation>();
		policies= new HashSet<Policy>();
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
	

	public Date getEntryMoment() {
		return entryMoment;
	}

	public void setEntryMoment(Date entryMoment) {
		this.entryMoment = entryMoment;
	}


	public Date getEndMoment() {
		return endMoment;
	}

	public void setEndMoment(Date endMoment) {
		this.endMoment = endMoment;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}


	public String getFullName()
	{
		return getName()+" "+getSurname();
	}

	private Collection<Payment> payments;
	private Collection<Expert> experts;
	private Collection<RepairCompany> repairCompanies;
	private Collection<Compensation> compensations;
	private Collection<Policy> policies;
	

	public Collection<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Collection<Payment> payments) {
		this.payments = payments;
	}
	

	public Collection<Expert> getExperts() {
		return experts;
	}

	public void setExperts(Collection<Expert> experts) {
		this.experts = experts;
	}
	
	

	public Collection<RepairCompany> getRepairCompanies() {
		return repairCompanies;
	}

	public void setRepairCompanies(Collection<RepairCompany> repairCompanies) {
		this.repairCompanies = repairCompanies;
	}
	
	public void addRepairCompany(RepairCompany repairCompany)
	{
		repairCompanies.add(repairCompany);
		
	}
	
	public void removeRepairCompany(RepairCompany repairCompany)
	{
		repairCompanies.remove(repairCompany);
		
	}

	public Collection<Compensation> getCompensations() {
		return compensations;
	}

	public void setCompensations(Collection<Compensation> compensations) {
		this.compensations = compensations;
	}

	public Collection<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(Collection<Policy> policies) {
		this.policies = policies;
	}
	
	public void addPolicy(Policy policy) {
		policies.add(policy);
		policy.setInsuranceCompany(this);
		
	
	}

	public void removePolicy(Policy policy) {
		policies.remove(policy);
		policy.setInsuranceCompany(null);
		
	
	}


}
