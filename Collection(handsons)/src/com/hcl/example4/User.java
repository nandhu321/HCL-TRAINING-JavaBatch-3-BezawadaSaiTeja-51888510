package com.hcl.example4;

import java.util.ArrayList;



public class User {
	private String name;
	private String contactNumber;
	private String userName;
	private String email;
	public User()
	{
		
	}
	public User(String name, String contactNumber, String userName, String email) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.userName = userName;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString(User i1)
	{
		
		return i1.getName()+"\t"+i1.getContactNumber()+"\t\t  "+i1.getUserName()+"\t\t"+i1.getEmail();
	}
	public static void display(ArrayList<User> a)
	{
		System.out.println("  Name 		ContactNumber		UserName	  Email");
		for(User i1:a)
		{
			System.out.println(i1.toString(i1));
		}
	}

}
