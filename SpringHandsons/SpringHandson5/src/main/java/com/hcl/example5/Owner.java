package com.hcl.example5;

import org.springframework.stereotype.Component;

@Component
public class Owner {
	private String name;
	private String password;
	private String mobileNumber;

	public void setDetails(String name, String password, String mobileNumber) {
		this.name=name;
		this.password=password;
		this.mobileNumber=mobileNumber;
	}

	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Mobile Number : "+mobileNumber);
	}

}
