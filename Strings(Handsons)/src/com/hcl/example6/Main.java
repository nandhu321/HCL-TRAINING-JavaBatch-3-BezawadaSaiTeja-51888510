package com.hcl.example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer str1=new StringBuffer();
		System.out.println("Enter Humty's sentence");
		String str=br.readLine();
		str1.append(str);
		
		System.out.println("Humty's says : "+str1);
		
		System.out.println("What Humpty want to insert ? ");
		String str2=br.readLine();
		System.out.println("Enter the Position :");
		int n=Integer.parseInt(br.readLine());
		str1.insert(n-1, str2+" ");
		System.out.println("Humpty's new sentence : "+str1.toString());
		
		
	}
}
