package com.hcl.example12;
import java.util.*;


import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of user details : ");
		int n=Integer.parseInt(br.readLine());
		List<User> lis=new ArrayList<>();
		for(int i=0 ;i<n;i++)
		{
			System.out.println("Enter the user "+(i+1)+" destails :");
			String l=br.readLine();
			String[] arr=l.split(",");
			lis.add(new User(arr[0],arr[1],arr[2],arr[3]));
		}
		System.out.println("Sort By : ");
		System.out.println("1. Name ");
		System.out.println("2. Email");
		int n1=Integer.parseInt(br.readLine());
		User u=new User();
		switch(n1)
		{
		case 1:
		{
			Collections.sort(lis,(p,q)->{
				User e1=(User)p;
				User e2=(User)q;
				String p1=e1.getName();
				String q1=e2.getName();
				return p1.compareTo(q1);
			});
			System.out.println(u);
			User.display(lis);
			break;
		}
		case 2:
		{
			Collections.sort(lis,(p,q)->{
				User e1=(User)p;
				User e2=(User)q;
				String p1=e1.getEmail();
				String q1=e2.getEmail();
				return p1.compareTo(q1);
			});
			System.out.println(u);
			User.display(lis);
			break;
		}
		default:
		{
			System.out.println("Invalid Choice");
			break;
		}
		}

	}

}
