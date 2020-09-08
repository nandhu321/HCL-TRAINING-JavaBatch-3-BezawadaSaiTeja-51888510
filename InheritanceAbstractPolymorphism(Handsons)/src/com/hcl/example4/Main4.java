package com.hcl.example4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Shape : ");
		System.out.println("1. Circle ");
		System.out.println("2. Rectangle : ");
		System.out.println("3. Traingle");
		int n = sc.nextInt();
		sc.nextLine();
		switch (n) {
		case 1: {
			System.out.println("enter the radius:");
			double radius = sc.nextDouble();
			sc.nextLine();
			Circle c = new Circle(radius);
			c.computeArea();
			break;
		}
		case 2: {
			System.out.println("enter the length and breadth");
			double length = sc.nextDouble();
			sc.nextLine();
			double breadth = sc.nextDouble();
			sc.nextLine();
			Rectangle r = new Rectangle(length, breadth);
			r.computeArea();
			break;
		}
		case 3: {
			System.out.println("Enter the base and height");
			double base = sc.nextDouble();
			sc.nextLine();
			double height = sc.nextDouble();
			sc.nextLine();
			Triangle t = new Triangle(base, height);
			t.computeArea();
			break;
		}
		default: {
			System.out.println("Invalid Choice");
			break;
		}
		}
		sc.close();
	}

}
