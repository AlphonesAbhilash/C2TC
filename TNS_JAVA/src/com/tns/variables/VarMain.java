package com.tns.variables;

public class VarMain{
	public static void main(String args[]) {
		Variables var=new Variables();
		
		System.out.println("Instance variable: "+var.firstnumber);
//		System.out.println("Static variable: "+var.thirdnumber);
		var.display();
	}
}