package com.tns.casestudy.bankingsystem;

public class Account {
	
	private int accountid;
	private int customerid;
	private String type;
	private double balance;
	
	public Account(int aid, int cid, String type, double balance) {
		this.accountid=aid;
		this.customerid=cid;
		this.type=type;
		this.balance=balance;
	}

	public int getAccountId() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", customerid=" + customerid + ", type=" + type + ", balance="
				+ balance + "]";
	}
	
	

}
