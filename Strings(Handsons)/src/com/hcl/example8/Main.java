package com.hcl.example8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Humpty's Sentence :");
		String str1=br.readLine();
		System.out.println("Converted String : "+str1.toUpperCase());
	}
}
