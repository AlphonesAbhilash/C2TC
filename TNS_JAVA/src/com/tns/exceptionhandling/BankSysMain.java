package com.tns.exceptionhandling;

public class BankSysMain {
	
	public static void main(String[] args) {
		BankAccount bank=new BankAccount(78453,"Abhilash",15000);
		
		bank.DisplayDetails();
//		bank.Deposit(5000);	
		bank.Deposit(100001);
		bank.Withdraw(7000);
		
	}

}
