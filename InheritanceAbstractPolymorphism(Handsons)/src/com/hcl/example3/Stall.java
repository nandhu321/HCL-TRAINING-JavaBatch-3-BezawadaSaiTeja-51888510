package com.hcl.example3;

public class Stall {
	protected String name;
	protected String detail;
	protected String ownerName;

	public Stall() {

	}

	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Double computeCost(String stallType, int squareFeet) {
		double d;
		if (stallType.equals("Platinum")) {
			d = 200 * squareFeet;
			return d;
		} else if (stallType.equals("Diamond")) {
			d = 150 * squareFeet;
			return d;
		} else {
			d = 100 * squareFeet;
			return d;
		}
	}

	public Double computeCost(String stallType, int squareFeet, int numberOfTV) {
		double d;
		if (stallType.equals("Platinum")) {
			d = 200 * squareFeet + (numberOfTV) * 10000;
			return d;
		} else if (stallType.equals("Diamond")) {
			d = 150 * squareFeet + (numberOfTV) * 10000;
			return d;
		} else {
			d = 100 * squareFeet + (numberOfTV) * 10000;
			return d;
		}

	}

}
