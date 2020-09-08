package com.hcl.example4;

import java.util.Scanner;

public class Main4 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String name, country, skill;
		String input;
		String[] l;
		System.out.println("Enter the player Details :");
		input = sc.nextLine();
		l = input.split(",");
		name = l[0];
		country = l[1];
		skill = l[2];
		Player p = new Player(name, country, skill);
		p.displayPlayerDetails();
		sc.close();
	}

}
