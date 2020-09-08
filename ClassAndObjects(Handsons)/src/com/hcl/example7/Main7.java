package com.hcl.example7;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long over, ball, runs;
		String batsman, bowler, nonStriker;

		System.out.println("enter the overs :");
		over = sc.nextLong();
		System.out.println("enter the balls :");
		ball = sc.nextLong();
		System.out.println("Enter the runs");
		runs = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name ");
		batsman = sc.nextLine();
		System.out.println("Enter the bowler name ");
		bowler = sc.nextLine();
		System.out.println("Enter the nonStriker name ");
		nonStriker = sc.nextLine();

		Delivery d = new Delivery(over, ball, runs, batsman, bowler, nonStriker);
		System.out.println("Delivery details :");
		System.out.println("Over : " + d.getOver());
		System.out.println("Ball : " + d.getBall());
		System.out.println("Runs : " + d.getRuns());
		System.out.println("Batsman : " + d.getBatsman());
		System.out.println("Bowler : " + d.getBowler());
		System.out.println("NonStriker: " + d.getNonStriker());
		sc.close();
	}

}
