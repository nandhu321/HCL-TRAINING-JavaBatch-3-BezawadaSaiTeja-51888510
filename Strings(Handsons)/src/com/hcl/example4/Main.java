package com.hcl.example4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Humpty's Sentence :");
		String str1=br.readLine();
		System.out.println("word to replace : ");
		String str2=br.readLine();
		System.out.println("synonym : ");
		String str3=br.readLine();
		System.out.println("Replaced String : "+str1.replace(str2, str3));
		
		
	}

}
