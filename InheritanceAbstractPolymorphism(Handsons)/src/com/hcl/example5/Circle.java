package com.hcl.example5;

public class Circle extends Shape {
	float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public Double calculatePerimeter() {
		return (double) 3.14 * 2 * radius;
	}

}
