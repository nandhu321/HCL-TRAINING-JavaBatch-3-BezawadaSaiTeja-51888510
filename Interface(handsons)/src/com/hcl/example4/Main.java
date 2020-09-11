package com.hcl.example4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What you want to visit :");
		System.out.println("1.Rajmachi ");
		System.out.println("3.Shivgadh");
		System.out.println("3.Murud ");
		System.out.println("Enter the choice : ");
		int n = sc.nextInt();
		sc.nextLine();
		switch (n) {
		case 1: {
			Fort f = new Rajmachi();
			f.distance();
			break;
		}
		case 2: {
			Fort f = new Shivgadh();
			f.distance();
			break;
		}
		case 3: {
			Fort f = new Murud();
			f.distance();
			break;

		}
		default: {
			System.out.println("Invalid Choice");
		}
		}
		sc.close();
	}

}
