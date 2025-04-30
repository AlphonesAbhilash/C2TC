package com.tns.oops;

public class EncapMain{
	
	public static void main(String args[]) {
		Encapsulation en=new Encapsulation();
		en.setEid(001);
		en.setEname("Alphones");
		en.setSal(2000000);
		System.out.println("Employee Name: "+en.getEid());
		System.out.println("Employee Name: "+en.getSal());
	}
}