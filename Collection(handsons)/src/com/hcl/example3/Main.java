package com.hcl.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> a=new ArrayList<>();
		System.out.println("Enter the number of Halls : ");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Hall name "+(i+1)+" :");
			String s=br.readLine();
			a.add(s);
			
		}
		System.out.println("Enter the hall name to search :");
		String s1=br.readLine();
		for(String s2:a)
		{
			if(s1.contains(s2))
			{
				System.out.println(s2+" hall is found in the list at position "+s1.indexOf(s2));
			}
		
		}
		
	
		
	}

}
