package com.hcl.example5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Shape : ");
		System.out.println("1. Circle ");
		System.out.println("2. Rectangle : ");
		System.out.println("3. Square");
		int n = sc.nextInt();
		sc.nextLine();
		switch (n) {
		case 1: {
			System.out.println("enter the radius:");
			float radius = sc.nextFloat();
			sc.nextLine();
			Circle c = new Circle(radius);
			System.out.format("The perimeter is : %.2f", c.calculatePerimeter());
			break;
		}
		case 2: {
			System.out.println("enter the length : ");
			float length = sc.nextFloat();
			sc.nextLine();
			System.out.println("enter the breadth : ");
			float breadth = sc.nextFloat();
			sc.nextLine();
			Rectangle r = new Rectangle(length, breadth);
			System.out.format("The perimeter is : %.2f", r.calculatePerimeter());
			break;
		}
		case 3: {
			System.out.println("Enter the side of square : ");
			float side = sc.nextFloat();
			Square s = new Square(side);
			System.out.format("The perimeter is : %.2f", s.calculatePerimeter());
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
