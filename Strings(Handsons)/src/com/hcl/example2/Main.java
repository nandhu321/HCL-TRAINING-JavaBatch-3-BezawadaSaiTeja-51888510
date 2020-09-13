package com.hcl.example2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Humpty's Sentence :");
		String str1=br.readLine();
		System.out.println("Enter Dumpty's Sentence :");
		String str2=br.readLine();
		if(str1.contains(str2))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
	}

}
