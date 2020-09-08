package com.hcl.example2;

import java.util.Scanner;

public class Main2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String details;
		System.out.println("Enter the Account Details : ");
		details = sc.nextLine();
		AccountBO ab = new AccountBO();
		FixedAccount ac1 = ab.getAccountDetail(details);
		System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
				"Minimum balance", "Locking period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n", ac1.getAccountNumber(), ac1.getBalance(),
				ac1.getAccountHolderName(), ac1.getMinimunBalance(), ac1.getLockingPeriod());

		sc.close();

	}

}
