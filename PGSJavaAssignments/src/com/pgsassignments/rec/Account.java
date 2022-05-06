package com.pgsassignments.rec;

public class Account {
	
	double balance;
	int accountNumber;
	String accountHolderName;
	
	public Account(double balance, int accountNumber, String accountHolderName) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public Account() {
		//super();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	
	public String print() {
		
		return "accountHolderName= " + accountHolderName + "\n" 
				+ "accountNumber= "+ accountNumber+ "\n"
				+ "balance= " + balance + " ";
	}
	
	
	
	
	
	

}
