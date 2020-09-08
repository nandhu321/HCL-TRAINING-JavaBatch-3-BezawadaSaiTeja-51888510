package com.hcl.example4;

public class Triangle extends Shape {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void computeArea() {
		super.computeArea();
		double area = (0.5) * base * height;

		System.out.format("Area of Triangle : %.2f", area);
	}
}