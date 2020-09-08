package com.hcl.example3;

public class Product2 {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;

	public Product2() {

	}

	public Product2(int product_code, String product_name, double price, int stock) {
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

	public static String checkLessStock(Product2 p1[]) {

		String s, h = null;

		int min = p1[0].stock;

		for (int i = 1; i < 5; i++) {
			if (p1[i].stock < min) {
				min = p1[i].stock;
				h = p1[i].product_name;
			}

		}

		s = "Name : " + h + "\nStock : " + min;
		return s;
	}

	public static String checkPrice(Product2 p1[]) {

		String s;

		double min = p1[0].price;

		for (int i = 1; i < 5; i++) {
			if (p1[i].price < min) {
				min = p1[i].price;

			}

		}

		s = min + "is the cheapest";
		return s;
	}

}
