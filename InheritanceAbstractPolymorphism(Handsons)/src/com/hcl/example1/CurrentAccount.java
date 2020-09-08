package com.hcl.example1;

public class CurrentAccount extends Account {
	private String tinNumber;

	public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {

		super(accName, accNo, bankName);
		this.tinNumber = tinNumber;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public void display(String accName, String accNo, String bankName, String tinNumber) {
		super.display(accName, accNo, bankName);
		System.out.println("TIN Nmber : " + tinNumber);
	}
}
