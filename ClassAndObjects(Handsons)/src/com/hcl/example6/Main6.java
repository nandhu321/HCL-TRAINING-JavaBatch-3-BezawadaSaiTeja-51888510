package com.hcl.example6;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		long runs;
		String[] l;
		String input;
		System.out.println("Enter the ExtraType  Details :");
		input = sc.nextLine();
		l = input.split("#");
		name = l[0];
		runs = Long.parseLong(l[1]);
		ExtraType et = new ExtraType();
		et.setName(name);
		et.setRuns(runs);
		System.out.println("Extra Type Details");
		System.out.println("Extra Type : " + et.getName());
		System.out.println("Runs : " + et.getRuns());

		sc.close();

	}
}
