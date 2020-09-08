package com.hcl.example8;

import java.util.Scanner;

public class Main8 {
	public static void main(String Args[]) {
		long over, ball;
		String[] l;

		String wicketType, playerName, bowlerName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		int n = sc.nextInt();
		sc.nextLine();
		String[] c = new String[n];
		for (int i = 0; i < n; i++) {

			System.out.println("Enter the wicket" + (i + 1) + " details :");
			c[i] = sc.nextLine();
		}
		Wicket w = new Wicket();
		for (int i = 0; i < n; i++) {
			l = c[i].split(",");
			over = Long.parseLong(l[0]);
			ball = Long.parseLong(l[1]);
			wicketType = l[2];
			playerName = l[3];
			bowlerName = l[4];
			w.setOver(over);
			w.setBall(ball);
			w.setWicketType(wicketType);
			w.setPlayerName(playerName);
			w.setBowlerName(bowlerName);
			System.out.println("Wicket Details :");
			System.out.println("Over : " + w.getOver());
			System.out.println("Ball : " + w.getBall());
			System.out.println("Wicket Type : " + w.getWicketType());
			System.out.println("Player Name : " + w.getPlayerName());
			System.out.println("Bowler Name : " + w.getBowlerName());
		}
		sc.close();
	}
}
