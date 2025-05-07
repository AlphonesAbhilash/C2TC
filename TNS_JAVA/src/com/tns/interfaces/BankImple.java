package com.tns.interfaces;

public class BankImple implements Bank {
	int balance=5000;
	@Override
	public void Withdraw(int amount) {
		if(amount>0 && amount<balance) {
			balance-=amount;
			System.out.println("Balance after withdraw: "+balance);
		}
		else {
			System.out.println("Insufficient Funds.");

		}
		
	}
	
	@Override
	public void Deposit(int amount) {
		if(amount<DEPOSIT_LIMIT) {
			balance+=amount;
			System.out.println("Balance after Deposit: "+balance);

		}
		else {
			System.out.println("Deposit Limit Exceeded. Deposit Limit: "+DEPOSIT_LIMIT);

		}
	}
}
