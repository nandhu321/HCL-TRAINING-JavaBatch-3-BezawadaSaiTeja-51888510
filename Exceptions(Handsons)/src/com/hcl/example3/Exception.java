package com.hcl.example3;

public class Exception {
	public void divide(int arr[], int f) {

		for (int i = 0; i < arr.length; i++) {
			try {
				if ((arr[i] % 2 == 0 && f % 2 == 0) || (arr[i] % 2 != 0 && f % 2 != 0)) {
					System.out.println("Result: " + arr[i] / f);
				} else {
					throw new IllegalArgumentException("Result: " + arr[i] / f);
				}
			} catch (IllegalArgumentException ie) {
				System.out.println("Exception handled in the method");
				System.out.println(ie.getMessage());
			}

		}
	}
}