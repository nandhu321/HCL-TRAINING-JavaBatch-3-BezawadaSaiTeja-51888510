package com.hcl.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Item> a=new ArrayList<>();
		System.out.println("Enter the details of Item Type 1:");
		System.out.println("Enter the name : ");
		String s=br.readLine();
		System.out.println("Enter the deposit : ");
		double str2=Double.parseDouble(br.readLine());
		System.out.println("Enter the Cost Per Day : ");
		double str3=Double.parseDouble(br.readLine());
		a.add(new Item(s, str2, str3));
		String c;
		int i=2;
		do {
		System.out.println("Do u want to continue (y/n)?");
		 c=br.readLine();
			if(c.equals("y")) {
				System.out.println("Enter the details of Item Type"+i+" :");
				System.out.println("Enter the name : ");
				s=br.readLine();
				System.out.println("Enter the deposit : ");
				str2=Double.parseDouble(br.readLine());
				System.out.println("Enter the Cost Per Day : ");
				str3=Double.parseDouble(br.readLine());
				a.add(new Item(s, str2, str3));
				i=i+1;
			}
			else
			{
				break;
			}
		}
		while(c.equals("y"));
		
		System.out.println("The names Entered  are :");
		System.out.println("Name	Deposit		CostPerDay");
		for(Item i1:a)
		{
			System.out.println(i1.toString(i1));
		}
		
	}

}
