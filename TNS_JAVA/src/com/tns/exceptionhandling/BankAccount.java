package com.tns.exceptionhandling;


public class BankAccount{
	
	class InvalidAmountException extends Exception {
	    public InvalidAmountException(String message) {
	        super(message);
	    }
	}
	
	class InsufficientFundsException extends Exception{
		public InsufficientFundsException(String message) {
			super(message);
		}
	}
	
	
	int account_number;
	double balance;
	static double WITHDRAW_LIMIT=10000;
	static double DEPOSIT_LIMIT=100000;
	String name;
	
	BankAccount(int an,String name,double bal){
		this.account_number=an;
		this.balance=bal;
		this.name=name;
	}
	
	public void Deposit(int amount){
		try {
			if(amount<0 || amount>DEPOSIT_LIMIT) {
				throw new InvalidAmountException("Invalid.. Deposit Limit: "+DEPOSIT_LIMIT);
			}
			
			balance+=amount;
			System.out.println("Balance after the Deposit Transaction: "+balance);

		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Withdraw(int amount) {
		try {
			if(amount<0 || amount > WITHDRAW_LIMIT) {
				throw new InsufficientFundsException("Insufficient Funds."+balance);
			}
			balance-=amount;
			System.out.println("Balance After the Withdraw Transaction: "+balance);

		}catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());

		}
	}
	
	public void DisplayDetails() {
		System.out.println("Account Number: "+account_number); 
		System.out.println("Balance: "+balance); 
		System.out.println("Name: "+name); 

	}
	
	
}
