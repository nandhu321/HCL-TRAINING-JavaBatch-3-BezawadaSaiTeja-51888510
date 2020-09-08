package com.hcl.example2;

public class Product1 {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;

	public Product1() {

	}

	public Product1(int product_code, String product_name, double price, int stock) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.price = price;
		this.stock = stock;
	}

	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public double getDiscountedPrice() {
		if (price >= 80000) {
			return (price * 30) / 100;
		} else if (price >= 60000 && price < 80000) {
			return (price * 20) / 100;
		} else if (price >= 50000 && price < 60000) {
			return (price * 10) / 100;
		} else {
			return (price * 5) / 100;
		}
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public static String checkPrice(Product1 p1, Product1 p2) {
		String s = null;
		if (p1.price > p2.price) {
			s = p2.product_name + " is cheap than " + p1.product_name;
			return s;
		} else {
			s = p1.product_name + " is cheap than " + p2.product_name;
			return s;
		}
	}

}
