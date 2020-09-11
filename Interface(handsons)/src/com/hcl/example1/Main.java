package com.hcl.example1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth : ");
		double length = sc.nextDouble();
		sc.nextLine();
		double breath = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the area : ");
		double area = sc.nextDouble();
		sc.nextLine();
		Polygon p = new Rectangle(length, breath);
		System.out.println("Perimeter of Rectangle is : " + p.calcPeri());
		System.out.println("Area of Rectangle is : " + p.calcArea());
		Polygon p1 = new Square(area);
		System.out.println("Perimeter of Square is : " + p1.calcPeri());
		System.out.println("Area of Square is : " + p1.calcArea());
		sc.close();

	}

}
