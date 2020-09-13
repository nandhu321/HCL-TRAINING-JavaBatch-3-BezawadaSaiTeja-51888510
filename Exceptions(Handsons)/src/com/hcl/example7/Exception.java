package com.hcl.example7;

public class Exception {
	public void divide(int a[], int d) throws ArithmeticException {

		for (int i = 0; i < a.length; i++) {

			System.out.println("Result: " + a[i] / d);

		}

	}
}
