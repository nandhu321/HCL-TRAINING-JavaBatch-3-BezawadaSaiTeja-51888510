package com.hcl.example2;

public class FixedAccount extends SavingsAccount {

	public FixedAccount(String accountNumber, double balance, String accountHolderName, double minimunBalance,
			int lockingPeriod) {
		super(accountNumber, balance, accountHolderName, minimunBalance);
		this.lockingPeriod = lockingPeriod;
	}

	private int lockingPeriod;

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}

}
