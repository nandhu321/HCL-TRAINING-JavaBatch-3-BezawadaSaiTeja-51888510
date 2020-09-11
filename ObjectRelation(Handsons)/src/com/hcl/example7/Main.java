package com.hcl.example7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many films ?");
		int n=Integer.parseInt(br.readLine());
		Songs s[][]=new Songs[n][3];
		Film f[]=new Film[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the film details");
			String line=br.readLine();
			String[] l=line.split(",");
			

			f[i]=new Film(Integer.parseInt(l[0]),l[1]);
			System.out.println("how many songs in "+f[i].getName());
			int ns=Integer.parseInt(br.readLine());
		
			System.out.println("Enter the song details");
			for(int j=0;j<ns;j++)
			{
				
				String c=br.readLine();
				String[] input1=c.split(":");
				
				s[i][j]=new Songs(Integer.parseInt(input1[0]),input1[1],input1[2],f[i].getD());
				
			}
			
		}
		System.out.println("Enter the film name :");
		String g=br.readLine();
		Film f1=new Film();
		
		
		int k=f1.getFilId(g,f);
		System.out.println("songs of "+g+" :");
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<3;j++)
		{
			int c=s[i][j].getFilm_id();
			if(k==c) {
				System.out.println("Song Name : "+s[i][j].getName());
				System.out.println("Singers : "+s[i][j].getSingers()+"\n");
			}
		}
			
		}
	}

}
