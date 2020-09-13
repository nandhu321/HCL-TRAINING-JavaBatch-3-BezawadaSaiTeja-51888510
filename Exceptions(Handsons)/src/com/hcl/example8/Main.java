package com.hcl.example8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int f;
		System.out.println("Enter any 10 values : ");
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the Divisor : ");
		f = Integer.parseInt(br.readLine());
		UserException ue=new UserException();
		try {
			ue.divide(arr, f);
		} catch (InvalidComboException we) {
			System.out.println(we.getMessage());
		}

	}
}
