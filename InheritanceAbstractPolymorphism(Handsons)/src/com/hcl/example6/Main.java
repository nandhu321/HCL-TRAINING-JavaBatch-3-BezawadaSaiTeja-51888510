package com.hcl.example6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the Event : ");
		String name = sc.nextLine();
		System.out.println("Enter the detail of the Event : ");
		String detail = sc.nextLine();
		System.out.println("Enter the owner name of the Event :");
		String owner = sc.nextLine();

		Event e1 = new Event(name, detail, owner);
		System.out.println("Enter the type of the event:");
		System.out.println("1.Exhibition");
		System.out.println("2.StageEvent");
		int n = sc.nextInt();
		sc.nextLine();

		switch (n) {
		case 1: {
			System.out.println("Enter the number of Stalls : ");
			int d = sc.nextInt();
			sc.nextLine();
			Exhibition e = new Exhibition(d);
			System.out.println("The cost of the stall is :" + e.projectedRevenue());
			break;

		}
		case 2: {
			System.out.println("Enter the number of Shows : ");
			int d = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the number of seats per show : ");
			int f = sc.nextInt();
			sc.nextLine();
			StageEvent se = new StageEvent(d, f);
			System.out.println("The cost of the stall is :" + se.projectedRevenue());
			break;
		}

		default: {
			System.out.println("Invalid Choice");
		}
			break;
		}

		sc.close();

	}

}
