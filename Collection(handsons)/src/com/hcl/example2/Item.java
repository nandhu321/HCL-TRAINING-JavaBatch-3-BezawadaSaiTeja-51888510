package com.hcl.example2;

public class Item {
	private String name;
	private double deposit;
	private double costPerDay;
	public Item()
	{
		
	}
	public Item(String name, double deposit, double costPerDay) {
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
	public String toString(Item i)
	{
		
		return i.getName()+"\t"+i.getDeposit()+"\t\t"+i.getCostPerDay();
	}

}
