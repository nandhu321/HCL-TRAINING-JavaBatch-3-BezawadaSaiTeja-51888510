package com.hcl;

import org.springframework.beans.factory.annotation.Required;

public class User {
	private String name;
	private String password;
	public User() {
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	@Required
	public void setPassword(String password) {
		this.password = password;
	}
	public String display()
	{
		return this.name;
		
	}

}
