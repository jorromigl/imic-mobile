package com.imic.app.imic;

import java.util.Date;




public class Comment extends DomainEntity {

	
	private String text;
	private String subject;
	private Date moment;
	

	public Comment() {
		super();
	}



	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	//----Relationships----------------------------------------------------
		
	private User user;
	private Incidence incidence;
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public Incidence getIncidence() {
		return incidence;
	}

	public void setIncidence(Incidence incidence) {
		this.incidence = incidence;
	}

}
