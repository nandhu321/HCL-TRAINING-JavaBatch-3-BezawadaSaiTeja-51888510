package com.hcl.example1;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=new String();
		System.out.println("Enter Humpty's Sentence :");
		String str1=br.readLine();
		System.out.println("Enter Dumpty's Sentence :");
		String str2=br.readLine();
		str=str1+"."+str2;
		System.out.println("Concatenated String : "+str);
	}

}
