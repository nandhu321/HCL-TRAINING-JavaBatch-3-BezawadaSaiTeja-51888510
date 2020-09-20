package com.hcl.example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Set<String> a=new HashSet<>();
		System.out.println("Enter the username : ");
		String s=br.readLine();
		a.add(s);
		String c;
		do {
		System.out.println("Do u want to continue (yes/no)?");
		 c=br.readLine();
			if(c.equals("yes")) {
			System.out.println("Enter the username :");
			String s2=br.readLine();
			a.add(s2);
			}
			else
			{
				break;
			}
		}
		while(c.equals("yes"));
		
		System.out.println("The unique usernames Entered  are :"+a.size());
		
		
		
	}


}
