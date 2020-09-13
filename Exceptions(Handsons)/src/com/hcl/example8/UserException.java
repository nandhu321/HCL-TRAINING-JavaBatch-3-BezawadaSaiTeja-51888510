package com.hcl.example8;

public class UserException {

	public void divide(int arr[], int f) throws InvalidComboException {

		for (int i = 0; i < arr.length; i++) {

			if ((arr[i] % 2 == 0 && f % 2 == 0) || (arr[i] % 2 != 0 && f % 2 != 0)) {
				System.out.println("Result: " + arr[i] / f);
			} else {
				throw new InvalidComboException("Invalid Combination: " + arr[i] + " " + f);
			}

		}
	}
}
