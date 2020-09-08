package com.hcl.example5;

public class Rectangle extends Shape {
	float length;
	float breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Double calculatePerimeter() {
		return (double) 2 * (length + breadth);
	}

}
