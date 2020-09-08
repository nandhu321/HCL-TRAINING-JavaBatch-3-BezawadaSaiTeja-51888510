package com.hcl.example4;

public class Rectangle extends Shape {
	private double length;
	private double breadth;

	public Rectangle() {

	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void computeArea() {
		super.computeArea();
		area = (length * breadth);

		System.out.format("Area of Rectangle : %.2f", area);
	}

}
