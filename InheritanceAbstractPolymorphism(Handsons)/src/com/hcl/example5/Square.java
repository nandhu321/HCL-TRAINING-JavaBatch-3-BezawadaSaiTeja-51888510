package com.hcl.example5;

public class Square extends Shape {
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	public Double calculatePerimeter() {
		return (double) 4 * side;
	}

}
