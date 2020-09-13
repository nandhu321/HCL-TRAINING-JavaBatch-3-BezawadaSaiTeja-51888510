package com.hcl.example5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		System.out.println("Dumpty says : " + str1);

		System.out.println("What Humpty want to remove ? ");
		String str2 = br.readLine();
		System.out.println("Dumpty new sentence : " + str1.replace(str2, ""));

	}
}
