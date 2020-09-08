package com.hcl.example3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the stall : ");
		String name = sc.nextLine();
		System.out.println("Enter the detail of the stall : ");
		String detail = sc.nextLine();
		System.out.println("Enter the owner name of the stall :");
		String owner = sc.nextLine();
		Stall s = new Stall(name, detail, owner);
		System.out.println("Enter the type of the stall:");
		String stallType = sc.nextLine();
		System.out.println("Enter the size of the stall in square feet : ");
		int squareFeet = sc.nextInt();
		sc.nextLine();
		System.out.println("Does the hall have TV?(y/n)");
		String tv = sc.next();

		if (tv.equals("y")) {
			System.out.println("Enter the number of TV:");
			int n = sc.nextInt();
			sc.nextLine();
			double c = s.computeCost(stallType, squareFeet, n);
			System.out.println("The cost of the stall is :" + c);

		} else {
			double c = s.computeCost(stallType, squareFeet);
			System.out.println("The cost of the stall is :" + c);
		}
		sc.close();
	}

}
