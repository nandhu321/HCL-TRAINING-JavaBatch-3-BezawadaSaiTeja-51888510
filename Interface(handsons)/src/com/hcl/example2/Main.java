package com.hcl.example2;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the car no :");
	    int carNum=sc.nextInt();
		sc.nextLine();
		System.out.println("How many years old car do you have :");
		int year=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the car brand :");
		String brand=sc.nextLine();
		Car c=new Service(carNum,year,brand);
		c.sum();
		c.brand();
		c.years();

	}

}
