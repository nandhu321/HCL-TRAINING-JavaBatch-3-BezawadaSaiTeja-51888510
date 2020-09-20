package com.hcl.example4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<User> a=new ArrayList<>();
		System.out.println("Enter the number of User details to be added");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			String l=br.readLine();
			String[] k=l.split(",");
			String name=k[0];
			String contactNumber=k[1];
			String userName=k[2];
			String email=k[3];
			a.add(new User(name,contactNumber,userName,email));
		}
		User.display(a);
		System.out.println("Enter the range to be removed from array list");
		int q=Integer.parseInt(br.readLine());
		int w=Integer.parseInt(br.readLine());
		UserBO u=new UserBO();
		u.removeUser(q, w, a);
		
		
		

	}

}
