package com.hcl.example4;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days : ");
		int c=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		sc.nextLine();
		try {
			System.out.println("Cost per day of the item is " +c/n);
		}
		catch (ArithmeticException a)
		{
			a.printStackTrace();
		}
	}

}
