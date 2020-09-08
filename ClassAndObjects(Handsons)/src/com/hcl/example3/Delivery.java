package com.hcl.example3;

public class Delivery {
	long over, ball, runs;
	String batsman, bowler, nonStriker;

	Delivery(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}

	public void displayDeliveryDetails() {
		System.out.println("Delivery details :");
		System.out.println("Over : " + over);
		System.out.println("Ball : " + ball);
		System.out.println("Runs : " + runs);
		System.out.println("Batsman : " + batsman);
		System.out.println("Bowler : " + bowler);
		System.out.println("NonStriker: " + nonStriker);

	}
}
