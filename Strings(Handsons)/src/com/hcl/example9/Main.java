package com.hcl.example9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Humpty's Sentence :");
		String str1=br.readLine();
		String str2=str1.toUpperCase();
		
		if(str1.equals(str2))
		{
			System.out.println("String is in upper case");
		}
		else
		{
			System.out.println("String is not in uppercase");
		}
	}
}
