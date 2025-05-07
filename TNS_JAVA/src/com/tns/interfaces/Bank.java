package com.tns.interfaces;

public interface Bank {
	
	int DEPOSIT_LIMIT=10000;
	void Deposit(int amount);
	void Withdraw(int amount);

}
