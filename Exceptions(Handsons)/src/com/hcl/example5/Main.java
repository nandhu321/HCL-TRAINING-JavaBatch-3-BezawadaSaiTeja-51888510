package com.hcl.example5;

import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException
	{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the name : ");
			String name=sc.readLine();
			System.out.println("Enter the amount : ");
			int amount=Integer.parseInt(sc.readLine());
			System.out.println("enter the cost per day : ");
			int c=Integer.parseInt(sc.readLine());
		
			ItemType i =new ItemType(name,amount,c);
			System.out.println(i);
		}
		catch (NumberFormatException n)
		{
			System.out.println(n.toString());
		}
	}
}
