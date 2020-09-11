package com.hcl.example5;

public class PremiumStall implements Stall{
	private String stallName;
	private int cost;
	private  String ownerName;
	private int Projecor;
	public PremiumStall()
	{
		
	}
	public PremiumStall(String stallName, int cost, String ownerName, int projecor) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		Projecor = projecor;
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getProjecor() {
		return Projecor;
	}
	public void setProjecor(int projecor) {
		Projecor = projecor;
	}
	
	public void display()
	{
		System.out.println("Stall Name : "+stallName);
		System.out.println("Cost : "+cost);
		System.out.println("Owner Name : "+ownerName);
		System.out.println("Number of Projectors : "+Projecor);
		
	}

}
