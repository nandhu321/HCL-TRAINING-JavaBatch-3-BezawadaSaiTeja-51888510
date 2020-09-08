package com.hcl.example4;

public class Circle extends Shape {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void computeArea() {
		super.computeArea();
		area = (Math.PI) * (radius) * radius;

		System.out.format("Area of Circle : %.2f", area);
	}

}
