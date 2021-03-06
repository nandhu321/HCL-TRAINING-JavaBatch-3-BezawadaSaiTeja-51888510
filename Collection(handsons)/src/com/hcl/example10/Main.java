package com.hcl.example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Hall> hl = new ArrayList<>();
		System.out.println("Enter the num of halls");
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("enter the hall " + (i + 1) + " detals");
			String details = br.readLine();
			String[] d = details.split(",");
			Hall h = new Hall(d[0], d[1], Double.parseDouble(d[2]), d[3]);
			hl.add(h);
		}
		Hall h1 = new Hall();
		h1.sortPrice(hl);
		h1.display(hl);
	}

}
