package com.hcl.example7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Humty's sentence");
		String str=br.readLine();
		int count1=0;
		int count2=0;
		int len1,len2;
		
		
		System.out.println("Enter Dumpty's Sentence");
		String str1=br.readLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count1=count1+1;
			}
		}
		len1=str.length()-count1;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==' ')
			{
				count2=count2+1;
			}
		}
		len2=str1.length()-count2;
		if(len1>len2)
		{
			System.out.println("Humpty has used more words ");
			
		}
		else if(len1<len2)
		{
			System.out.println("Dumpty has used more words ");
		}
		else
		{
			System.out.println("Both have used equal number of words");
		}
		
		
	}
}
