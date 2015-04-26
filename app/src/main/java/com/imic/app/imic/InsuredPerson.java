package com.imic.app.imic;

import java.util.Collection;

import java.util.HashSet;



public class InsuredPerson extends User {

	@SuppressWarnings("unused")
	private String fullName;

	public InsuredPerson() {
		super();

		compensations = new HashSet<Compensation>();
		policies = new HashSet<Policy>();
	}

	public String getFullName()
	{
		return getSurname()+", "+getName();
	}
	
	private Collection<Compensation> compensations;
	private Collection<Policy> policies;
	

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
	
	

}
