package com.hcl.example2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name :");
		String name = sc.nextLine();
		System.out.println("Enter the Country Name :");
		String country = sc.nextLine();
		System.out.println("Enter the Skill :");
		String skill = sc.nextLine();
		Player p = new Player();
		p.displaySkills(name, country, skill);
		sc.close();
	}

}
