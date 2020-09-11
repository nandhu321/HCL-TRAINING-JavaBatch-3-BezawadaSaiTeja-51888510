package com.hcl.example8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Film f=new Film();
	
		
			System.out.println("Enter the film details");
			String line=br.readLine();
			String[] l=line.split(",");
			

			f=new Film(Integer.parseInt(l[0]),l[1]);
			System.out.println("how many actors in ?");
			int ns=Integer.parseInt(br.readLine());
		
			Actor[] a=new Actor[ns];
			System.out.println("Enter the actors");
			for(int j=0;j<ns;j++)
			{
				
					
				String c=br.readLine();
				String[] input1=c.split(",");
				
				a[j]=new Actor(Integer.parseInt(input1[0]),input1[1]);
				
			}
			
		
		System.out.println("film details :");
		System.out.println("film name : "+f.getName()+"\n");
		System.out.println("Actors : \n");
			
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i].getName());
		}
		
	}

}
