package com.hcl.example2;

import java.util.Scanner;

public class Test1 {
	static int product_code;
	static String product_name;
	static double price;
	static int stock;

	public static Product1 buildProduct() {
		Scanner sc = new Scanner(System.in);

		Product1 p = new Product1();

		System.out.println("enter the first product:\n");
		System.out.println("enter the product code : ");
		product_code = sc.nextInt();
		sc.nextLine();
		p.setProduct_code(product_code);
		System.out.println("enter the product name : ");
		product_name = sc.nextLine();
		p.setProduct_name(product_name);
		System.out.println("enter the price : ");
		price = sc.nextDouble();
		p.setPrice(price);
		sc.nextLine();
		System.out.println("enter the stock : ");
		stock = sc.nextInt();
		sc.nextLine();
		p.setStock(stock);

		sc.close();
		return p;
	}

	public static void main(String[] args) {
		Product1 p1 = buildProduct();
		Product1 p2 = buildProduct();
		System.out.println(p1.getPrice());
		System.out.println(p2.getPrice());
		System.out.println("\nProduct Details : \n");
		System.out.println("L & K SUPPLIERS");
		System.out.println("Product Code : " + p1.getProduct_code());
		System.out.println("Name : " + p1.getProduct_name());
		System.out.println("Price : " + p1.getPrice());
		System.out.println("Stock : " + p1.getStock());
		System.out.println("Discounted Price : " + p1.getDiscountedPrice() + "\n");
		System.out.println("L & K SUPPLIERS");
		System.out.println("Product Code : " + p2.getProduct_code());
		System.out.println("Name : " + p2.getProduct_name());
		System.out.println("Price : " + p2.getPrice());
		System.out.println("Stock : " + p2.getStock());
		System.out.println("Discounted Price : " + p2.getDiscountedPrice() + "\n");
		System.out.println(Product1.checkPrice(p1, p2));

	}

}
