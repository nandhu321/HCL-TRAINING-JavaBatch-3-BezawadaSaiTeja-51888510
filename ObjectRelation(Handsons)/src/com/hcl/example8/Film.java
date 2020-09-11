package com.hcl.example8;

public class Film {
	int d ;
	String name ;
	Actor[] actor;
	public Film()
	{
		
	}
	public Film(int d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
