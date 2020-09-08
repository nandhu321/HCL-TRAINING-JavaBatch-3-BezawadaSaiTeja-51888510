package com.hcl.example2;

public class SavingsAccount extends Account {
	protected double minimunBalance;

	public SavingsAccount() {

	}

	public SavingsAccount(String accountNumber, double balance, String accountHolderName, double minimunBalance) {
		super(accountNumber, balance, accountHolderName);
		this.minimunBalance = minimunBalance;
	}

	public double getMinimunBalance() {
		return minimunBalance;
	}

	public void setMinimunBalance(double minimunBalance) {
		this.minimunBalance = minimunBalance;
	}

}
