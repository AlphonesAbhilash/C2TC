package com.tns.interfaces;

public class BankMain {
	public static void main(String[] args) {
		BankImple bank=new BankImple();
		
		bank.Deposit(5000);
		bank.Withdraw(3000);
	}
}
