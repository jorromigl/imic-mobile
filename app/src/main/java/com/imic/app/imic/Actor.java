package com.imic.app.imic;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;



import org.codehaus.jackson.annotate.JsonIgnore;



public abstract class Actor extends DomainEntity {

	private String name;
	private String surname;
	private String email;
	private String phone;
	private Date moment;
	
	
	public Actor() {
		super();
		folders = new HashSet<Folder>();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}

	private Collection<Folder> folders;
	private UserAccount userAccount;
	
	@JsonIgnore
	public Collection<Folder> getFolders() {
		return folders;
	}

	public void setFolders(Collection<Folder> folders) {
		this.folders = folders;
	}
	
	
	@JsonIgnore
	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

}