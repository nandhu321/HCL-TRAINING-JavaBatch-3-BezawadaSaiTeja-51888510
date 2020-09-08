package com.hcl.example1;

public class Product {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;

	public Product() {

	}

	public Product(int product_code, String product_name, double price, int stock) {
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

	public void setStock(int stock) {
		this.stock = stock;
	}

	public static void checkPrice(Product p1, Product p2) {
		if (p1.price > p2.price) {
			System.out.println(p2.product_name + " is cheap than " + p1.product_name);
		} else {
			System.out.println(p1.product_name + " is cheap than " + p2.product_name);
		}
	}

}
