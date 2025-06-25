package com.tns.casestudy.bankingsystem;

import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class BankingServiceImplementation implements BankingService{
	
		private Map<Integer,Account> accounts=new HashMap<>();
		private Map<Integer, Customer> customers=new HashMap<>();
		private Map<Integer, Transaction> transactions=new HashMap<>();
		private Map<Integer, Benificiary> benificiaries=new HashMap<>();
		
		@Override
		public void addAccount(Account account) {
			accounts.put(account.getAccountId(), account);
		}


	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customers.put(customer.getCustomerid(), customer);
	}


	@Override
	public void addTransaction(Transaction trans) {
		// TODO Auto-generated method stub
		transactions.put(trans.getTransactionid(), trans);
	}


	@Override
	public void addBenificiary(Benificiary beni) {
		// TODO Auto-generated method stub
		benificiaries.put(beni.getBenificiaryid(),beni);
	}


	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
	return customers.get(id);
	}


	@Override
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		return accounts.get(id);
	}


	@Override
	public Transaction findTransactionById(int id) {
		// TODO Auto-generated method stub
		return transactions.get(id);
	}


	@Override
	public Benificiary findBenificiaryById(int id) {
		// TODO Auto-generated method stub
		return benificiaries.get(id);
	}


	@Override
	public Collection<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accounts.values();
	}


	@Override
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customers.values();
	}


	@Override
	public Collection<Transaction> getAllTransactions() {
		// TODO Auto-generated method stub
		return transactions.values();
	}


	@Override
	public Collection<Benificiary> getAllBenificiaries() {
		// TODO Auto-generated method stub
		return benificiaries.values();
	}


	@Override
	public List<Account> getAccountsByCustomerId(int id) {
		// TODO Auto-generated method stub
		List<Account> result=new ArrayList<>();
		result.add(accounts.get(id));
		return result;
	}


	@Override
	public List<Transaction> getTransactionByAccountId(int id) {
		// TODO Auto-generated method stub
		List<Transaction> result=new ArrayList<>();
		result.add(transactions.get(id));
		return result;
	}


	@Override
	public List<Benificiary> getBeneficiaryByCustomerId(int id) {
		// TODO Auto-generated method stub
		List<Benificiary> result=new ArrayList<>();
		result.add(benificiaries.get(id));
		return result;
		
		
	}

}
