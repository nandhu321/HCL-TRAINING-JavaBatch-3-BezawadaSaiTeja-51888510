package com.hcl.example1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter the 10 values : ");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		Exception1 e=new Exception1();
		e.divide(arr);
		sc.close();
	}

}
