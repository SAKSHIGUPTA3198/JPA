package com.lti.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

public class Current extends Account {
	private double overdraft;

	public Current() {
		super();

	}

	public Current(long accountNumber, String accountHolderName, double accountBalance,double overdraft) {
		super(accountNumber, accountHolderName, accountBalance);
		this .overdraft= overdraft;
		
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public String toString() {
		return "Current [overdraft=" + overdraft + ", toString()=" + super.toString() + "]";
	}

	
	

}
