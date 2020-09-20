package com.hcl.example11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Address> hl = new ArrayList<>();
		System.out.println("Enter the num of users");
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("enter the hall " + (i + 1) + " detals");
			String details = br.readLine();
			String[] d = details.split(",");
			Address a = new Address(d[0], d[1], d[2], Integer.parseInt(d[3]));
			hl.add(a);
		}

		Collections.sort(hl);
		Address.display(hl);
	}

}
