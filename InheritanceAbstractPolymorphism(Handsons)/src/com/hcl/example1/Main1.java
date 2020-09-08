package com.hcl.example1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		String input;
		String[] l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Account Type");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		int n = sc.nextInt();
		sc.nextLine();
		switch (n) {
		case 1: {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name) : ");
			input = sc.nextLine();
			l = input.split(",");
			SavingsAccount s = new SavingsAccount(l[0], l[1], l[2], l[3]);
			s.display(s.getAccName(), s.getAccNo(), s.getBankName(), s.getOrgName());
			break;
		}
		case 2: {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number) :");
			input = sc.nextLine();
			l = input.split(",");
			CurrentAccount c = new CurrentAccount(l[0], l[1], l[2], l[3]);
			c.display(c.getAccName(), c.getAccNo(), c.getBankName(), c.getTinNumber());
			break;
		}
		default: {
			System.out.println("Invalid Choice");
		}

		}
		sc.close();

	}

}
