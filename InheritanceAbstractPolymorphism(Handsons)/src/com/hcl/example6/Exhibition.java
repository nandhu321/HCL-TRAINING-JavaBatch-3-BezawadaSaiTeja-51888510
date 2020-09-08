package com.hcl.example6;

public class Exhibition extends Event {
	private int noOfStall;

	public Exhibition(int noOfStall) {
		super();
		this.noOfStall = noOfStall;
	}

	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

	public Double projectedRevenue() {

		return (double) 10000 * noOfStall;
	}

}
