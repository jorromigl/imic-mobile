package com.imic.app.imic;

import java.util.Collection;

import java.util.HashSet;





public class Admin extends Actor {

	private Collection<Payment> payments;
	private Paypal paypal;

	public Admin() {
		super();

		payments = new HashSet<Payment>();
	}


	public Paypal getPaypal() {
		return paypal;

	}

	public void setPaypal(Paypal paypal) {
		this.paypal = paypal;

	}


	public Collection<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Collection<Payment> payments) {
		this.payments = payments;
	}

}
