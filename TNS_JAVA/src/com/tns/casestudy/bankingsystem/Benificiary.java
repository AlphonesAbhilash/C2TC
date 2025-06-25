package com.tns.casestudy.bankingsystem;

public class Benificiary {
	
	private int benificiaryid;
	private int customerid;
	private String name;
	private String accnumber;
	private String bankdetails;
	
	public Benificiary(int bid, int cid, String name, String ano, String bnkdetails) {
		this.benificiaryid=bid;
		this.customerid=cid;
		this.name=name;
		this.accnumber=ano;
		this.bankdetails=bnkdetails;
	}

	public int getBenificiaryid() {
		return benificiaryid;
	}

	public void setBenificiaryid(int benificiaryid) {
		this.benificiaryid = benificiaryid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}

	public String getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(String bankdetails) {
		this.bankdetails = bankdetails;
	}

	@Override
	public String toString() {
		return "Benificiary [benificiaryid=" + benificiaryid + ", customerid=" + customerid + ", name=" + name
				+ ", accnumber=" + accnumber + ", bankdetails=" + bankdetails + "]";
	}

	
}
