package com.tns.casestudy.bankingsystem;

import java.util.Collection;
import java.util.List;

public interface BankingService {
	
	void addCustomer(Customer customer);
	void addAccount(Account acc);
	void addTransaction(Transaction trans);
	void addBenificiary(Benificiary beni);
	
	Customer findCustomerById(int id);
	Account findAccountById(int id);
	Transaction findTransactionById(int id);
	Benificiary findBenificiaryById(int id);
	
	Collection<Account> getAllAccounts();
	Collection<Customer> getAllCustomers();
	Collection<Transaction> getAllTransactions();
	Collection<Benificiary> getAllBenificiaries();
	
	List<Account> getAccountsByCustomerId(int id);
	List<Transaction> getTransactionByAccountId(int id);
	List<Benificiary> getBeneficiaryByCustomerId(int id);

}
