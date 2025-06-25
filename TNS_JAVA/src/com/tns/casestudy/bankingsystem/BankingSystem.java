package com.tns.casestudy.bankingsystem;

import java.util.Scanner;
import java.util.Collection;

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingService service=new BankingServiceImplementation();
		System.out.println("1. Add Account.\n2. Add Customer\n3. Make a Transaction\n4. Find Customer By Id\n5. View All Accounts\nEnter your Choice: ");
		
		Scanner sc=new Scanner(System.in);
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1: 	
			System.out.println("Add Account Number: ");
			int ano=sc.nextInt();
			System.out.println("Customer ID: ");
			int cid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter account type(Savings/Current): ");
			String type=sc.nextLine();
			System.out.println("Enter the Balance: ");
			double balance=sc.nextDouble();
			Account a=new Account(ano,cid,type,balance);
			service.addAccount(a);
			System.out.println("Account added successfully.");
			break;

		case 2:
			System.out.println("Enter Customer ID:");
			int cuid=sc.nextInt();
			System.out.println("Enter Name: ");
			String name=sc.nextLine();
			System.out.println("Enter Address: ");
			String addr=sc.nextLine();
			System.out.println("Enter Contact No. :");
			String contact=sc.nextLine();
			Customer c=new Customer(cuid,name,addr,contact);
			service.addCustomer(c);
			System.out.println("Customer added Successfully.");
			break;
			
		case 5:
			Collection<Account> allaccounts=service.getAllAccounts();
			for(Account account : allaccounts) {
				System.out.println(account);

			}

		}
		
	}

}
