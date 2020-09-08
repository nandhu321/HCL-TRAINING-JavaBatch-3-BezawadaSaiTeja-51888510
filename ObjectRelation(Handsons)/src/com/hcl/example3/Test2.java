package com.hcl.example3;

import java.util.Scanner;

public class Test2 {

	static int product_code;
	static String product_name;
	static double price;
	static int stock;

	public static Product2 buildProduct() {
		Scanner sc = new Scanner(System.in);

		Product2 p = new Product2();

		System.out.println("enter the  product:\n");
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
		Product2[] p1 = new Product2[5];
		for (int i = 0; i < 5; i++) {
			p1[i] = buildProduct();
		}
		for (int i = 0; i < 5; i++) {

			System.out.println("\nProduct Details : \n");
			System.out.println("L & K SUPPLIERS");
			System.out.println("Product Code : " + p1[i].getProduct_code());
			System.out.println("Name : " + p1[i].getProduct_name());
			System.out.println("Price : " + p1[i].getPrice());
			System.out.println("Stock : " + p1[i].getStock());
			System.out.println("Discounted Price : " + p1[i].getDiscountedPrice());

		}
		System.out.println(Product2.checkPrice(p1));
		System.out.println("The Product with min stock : ");
		System.out.println("\nL & K SUPPLIERS");
		System.out.println(Product2.checkLessStock(p1));

	}

}
