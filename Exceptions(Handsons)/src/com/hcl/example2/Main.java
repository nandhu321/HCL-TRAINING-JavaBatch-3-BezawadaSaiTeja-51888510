package com.hcl.example2;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter the 10 values : ");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the Divisor : ");
		int a=sc.nextInt();
		sc.nextLine();
		Exception2 e=new Exception2();
		e.divide(arr,a);
		sc.close();
	}
}
