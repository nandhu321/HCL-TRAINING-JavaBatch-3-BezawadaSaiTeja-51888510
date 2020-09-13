package com.hcl.example3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str1=new StringBuilder();
		System.out.println("Enter Humpty's Sentence :");
		String str=br.readLine();
		str1.append(str);
		str1.reverse();
		System.out.println("Dumpty says , "+str1.toString());
		
	}
}
