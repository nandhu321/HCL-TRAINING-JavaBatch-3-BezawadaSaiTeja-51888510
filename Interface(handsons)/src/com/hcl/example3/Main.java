package com.hcl.example3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bank name : ");
		String name=sc.nextLine();
		if(name.equals("Axis"))
		{
			System.out.println("Enter the amount : ");
			int amount=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the nof years :");
			int duration=sc.nextInt();
			sc.nextLine();
			MutualFund m=new AxisBank(duration, amount);
			m.duration();
			m.amount();
		}
		if(name.equals("Hdfc"))
		{
			System.out.println("Enter the amount : ");
			int amount=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the nof years :");
			int duration=sc.nextInt();
			sc.nextLine();
			MutualFund m=new Hdfc(duration, amount);
			m.duration();
			m.amount();
		}
		if(name.equals("ICICI"))
		{
			System.out.println("Enter the amount : ");
			int amount=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the nof years :");
			int duration=sc.nextInt();
			sc.nextLine();
			MutualFund m=new ICICI(duration, amount);
			m.duration();
			m.amount();
		}
		sc.close();
	}

}
