package com.hcl.example9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] s) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Stall> list = new ArrayList<>();
		int no = Integer.parseInt(br.readLine());
		System.out.println("Enter the details ");
		for (int i = 0; i < no; i++) {
			String details = br.readLine();
			String d[] = details.split(",");
			Stall stall = new Stall(d[0], d[1], d[2], d[3]);
			list.add(stall);
		}
		Stall s1 = new Stall();
		s1.removeTest(list);
		s1.display(list);
	}
}
