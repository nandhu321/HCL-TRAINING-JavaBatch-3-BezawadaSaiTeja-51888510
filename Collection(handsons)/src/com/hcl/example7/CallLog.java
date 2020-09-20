package com.hcl.example7;

import java.util.*;



public class CallLog  {
	private String name;
	private String number;
	private String duration ;
	public CallLog()
	{
		
	}
	public CallLog(String name, String number, String duration) {
		super();
		this.name = name;
		this.number = number;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String toString(CallLog i1)
	{
		
		return i1.getName()+" (+91-"+i1.getNumber()+")\t\t"+i1.getDuration()+" Seconds";
	}
	public static void display(ArrayList<CallLog> a)
	{
		System.out.println("Call-logs");
		System.out.println("Caller Name 		 	Duration");
		for(CallLog i1:a)
		{
			System.out.println(i1.toString(i1));
		}
	}
	

}
