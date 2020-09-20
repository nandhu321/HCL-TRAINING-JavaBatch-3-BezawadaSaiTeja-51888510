package com.hcl.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> a=new ArrayList<>();
		System.out.println("Enter the username1 : ");
		String s=br.readLine();
		a.add(s);
		String c;
		int i=2;
		do {
		System.out.println("Do u want to continue (y/n)?");
		 c=br.readLine();
			if(c.equals("y")) {
			System.out.println("Enter the username"+i+" :");
			String s2=br.readLine();
			a.add(s2);
			}
			else
			{
				break;
			}
		}
		while(c.equals("y"));
		
		System.out.println("The names Entered  are :");
		for(String d:a)
		{
			System.out.println(d);
		}
		
	}

}
