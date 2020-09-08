package com.hcl.example4;

public class Player {
	String name, country, skill;

	Player(String name, String country, String skill) {
		this.name = name;
		this.country = country;
		this.skill = skill;

	}

	public void displayPlayerDetails() {
		System.out.println("Player Details :");
		System.out.println("Player Name : " + name);
		System.out.println("Country Name : " + country);
		System.out.println("Skill : " + skill);
	}

}
