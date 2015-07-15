package com.andela.spring;

public class Salary {

	private BankAccount bankAccount;

	public BankAccount getAccount() {
		return bankAccount;
	}

	public void setAccount(BankAccount account) {
		this.bankAccount = account;
	}

	private double rate = 0;

	public void calculate() {
		if (rate == 0) {
			rate = Math.random();
		}
		System.out.println("You have got a salary raise by £" + rate);
		this.getAccount().createNewAccount();
	}
}
