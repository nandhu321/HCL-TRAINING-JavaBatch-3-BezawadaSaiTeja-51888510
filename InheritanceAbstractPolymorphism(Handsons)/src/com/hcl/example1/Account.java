package com.hcl.example1;

public class Account {
	public Account(String accName, String accNo, String bankName) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}

	protected String accName;
	protected String accNo;
	protected String bankName;

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	protected void display(String accName, String accNo, String bankName) {
		System.out.println("Account Name : " + accName);
		System.out.println("Account Number : " + accNo);
		System.out.println("Bank name : " + bankName);
	}
}