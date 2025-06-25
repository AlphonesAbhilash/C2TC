package com.tns.casestudy.bankingsystem;

import java.time.LocalDateTime;

public class Transaction {
	
	private int transactionid;
	private int accountid;
	private String type;
	private double amount;
	private LocalDateTime timestamp;
	
	public Transaction(int aid,String type, double amount) {
		this.accountid=aid;
		this.type=type;
		this.amount=amount;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionid=" + transactionid + ", accountid=" + accountid + ", type=" + type
				+ ", amount=" + amount + ", timestamp=" + timestamp + "]";
	}

	public Integer getTransactionid() {
		// TODO Auto-generated method stub
		return transactionid;
	}
	
	
}
