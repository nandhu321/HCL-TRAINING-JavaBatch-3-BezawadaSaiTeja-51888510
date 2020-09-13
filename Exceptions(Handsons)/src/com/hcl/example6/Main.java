package com.hcl.example6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the integer input");
			int n=sc.nextInt();
			System.out.println("the entered number is : "+n);
			}
		catch(InputMismatchException e)
		{
			System.out.println(e.toString());;
		}
		
	}

}
