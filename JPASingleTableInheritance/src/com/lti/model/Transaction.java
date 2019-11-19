package com.lti.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
@DiscriminatorColumn(name="trans_type")
public  abstract class Transaction {
	
	
	@Id
	private int transcid;
	 private int transcamount;
	 
	 
	 @ManyToOne
		@JoinColumn(name="accountNumber")	
	 
	 private Account account;
	public Transaction() {
		super();
	}
	public Transaction(int transcid, int transcamount) {
		super();
		this.transcid = transcid;
		this.transcamount = transcamount;
	}

	public int getTranscid() {
		return transcid;
	}
	public void setTranscid(int transcid) {
		this.transcid = transcid;
	}
	public int getTranscamount() {
		return transcamount;
	}
	public void setTranscamount(int transcamount) {
		this.transcamount = transcamount;
	}
	@Override
	public String toString() {
		return "Transaction [transcid=" + transcid + ", transcamount=" + transcamount + "]";
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	 
	
	
	
	

}
