package com.hcl.example5;

import java.util.*;
import java.io.IOException;

public class Main {
	public static Employee[] getEmployeeData() throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		String[] l = new String[5];
		String[] c;
		Employee[] employeeArray = new Employee[5];
		for (int i = 0; i < 5; i++) {
			l[i] = sc.nextLine();
		}
		for (int i = 0; i < 5; i++) {
			c = l[i].split(",");
			int n = Integer.parseInt(c[0]);
			int d = Integer.parseInt(c[5]);
			employeeArray[i] = new Employee(n, c[1], c[2], c[3], c[4], d);
		}
		sc.close();
		return employeeArray;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Employee[] e = Main.getEmployeeData();
		Employee.wishBirthday(e);
	}

}
