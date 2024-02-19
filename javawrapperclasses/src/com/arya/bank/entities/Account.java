package com.arya.bank.entities;

public class Account implements Valid  {
	
	private int accountNo;
	private String name;
	private float Balance;
	
	public Account() {
		
	}
	public Account(int accountNo, String name, float balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		Balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", Balance=" + Balance + "]";
	}
	
	

}
