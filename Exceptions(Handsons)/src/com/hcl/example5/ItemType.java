package com.hcl.example5;

public class ItemType {
	String name	;	
	double deposit	;
	double costPerDay;
	public ItemType(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}	
	public String toString()
	{
		String s=null;
		s="Name : "+name+"\nDeposit : "+deposit+"\nCost Per Day : "+costPerDay;
		return s;
	}

}
