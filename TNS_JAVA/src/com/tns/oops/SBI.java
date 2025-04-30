package com.tns.oops;

public class SBI implements RBI{
	
	public void rateOfInterest() {
		System.out.println("Rate of Interest in SBI: "+8.6);
		
	}
	
	public void show() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI r=new SBI();
		r.rateOfInterest();
	}

}
