package com.hcl.example5;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the venue name");
		String name = sc.nextLine();
		System.out.println("Enter the city name");
		String city = sc.nextLine();
		Venue v = new Venue();
		v.setName(name);
		v.setCity(city);
		System.out.println("Venue Details :");
		System.out.println("Venue Name : " + v.getName());
		System.out.println("City Name : " + v.getCity());
		do {
			System.out.println("Verify and Update Venue Details");
			System.out.println("1. Update Stadium");
			System.out.println("2. Update City");
			System.out.println("3. All informations Correct/Exit ");
			n = sc.nextInt();
			if (n == 1) {
				System.out.println("Enter the venue name :");
				name = sc.next();
				v.setName(name);
				System.out.println("Venue Details :");
				System.out.println("Venue Name : " + v.getName());
				System.out.println("City Name : " + v.getCity());
			} else if (n == 2) {

				System.out.println("Enter the City  name :");
				city = sc.next();
				v.setCity(city);
				System.out.println("Venue Details :");
				System.out.println("Venue Name : " + v.getName());
				System.out.println("City Name : " + v.getCity());
			} else if (n == 3) {
				System.out.println("Venue Details :");
				System.out.println("Venue Name : " + v.getName());
				System.out.println("City Name : " + v.getCity());
				break;
			}

		} while (n <= 3);
		sc.close();
	}

}
