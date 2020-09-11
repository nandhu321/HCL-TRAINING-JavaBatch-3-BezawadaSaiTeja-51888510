package com.hcl.example1;

public class Square implements Polygon {
	private double side;

	public Square() {

	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double calcPeri() {
		return (double) (4 * side);
	}

	public double calcArea() {
		return (double) (side * side);
	}

}
