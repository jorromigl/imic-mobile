package com.imic.app.imic;
import java.util.Collection;
import java.util.HashSet;


import org.codehaus.jackson.annotate.JsonIgnore;


public abstract class User extends Actor {

	
	private String referenceNumber;
	private String address;

	public User() {
		super();

		comments = new HashSet<Comment>();
	}

	public String getReferenceNumber() {

		return referenceNumber;

	}

	public void setReferenceNumber(String referenceNumber) {

		this.referenceNumber = referenceNumber;

	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	private Collection<Comment> comments;
	
	@JsonIgnore
	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

}
