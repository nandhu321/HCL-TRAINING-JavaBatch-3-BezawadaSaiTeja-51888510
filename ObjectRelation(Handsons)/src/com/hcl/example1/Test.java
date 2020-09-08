package com.hcl.example1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int product_code;
		String product_name;
		double price;
		int stock;
		Scanner sc = new Scanner(System.in);

		Product p1 = new Product();
		Product p2 = new Product();
		System.out.println("enter the first product:\n");
		System.out.println("enter the product code : ");
		product_code = sc.nextInt();
		sc.nextLine();
		p1.setProduct_code(product_code);
		System.out.println("enter the product name : ");
		product_name = sc.nextLine();
		p1.setProduct_name(product_name);
		System.out.println("enter the price : ");
		price = sc.nextDouble();
		p1.setPrice(price);
		sc.nextLine();
		System.out.println("enter the stock : ");
		stock = sc.nextInt();
		sc.nextLine();
		p1.setStock(stock);
		System.out.println("enter the Second product:\n");
		System.out.println("enter the product code : ");
		product_code = sc.nextInt();
		sc.nextLine();
		p2.setProduct_code(product_code);
		System.out.println("enter the product name : ");
		product_name = sc.nextLine();
		p2.setProduct_name(product_name);
		System.out.println("enter the price : ");
		price = sc.nextDouble();
		p2.setPrice(price);
		sc.nextLine();
		System.out.println("enter the stock : ");
		stock = sc.nextInt();
		sc.nextLine();
		p2.setStock(stock);
		System.out.println("\nProduct Details : \n");
		System.out.println("Product Code : " + p1.getProduct_code());
		System.out.println("Name : " + p1.getProduct_name());
		System.out.println("Price : " + p1.getPrice());
		System.out.println("Stock : " + p1.getStock() + "\n");
		System.out.println("Product Code : " + p2.getProduct_code());
		System.out.println("Name : " + p2.getProduct_name());
		System.out.println("Price : " + p2.getPrice());
		System.out.println("Stock : " + p2.getStock() + "\n");
		Product.checkPrice(p1, p2);

		sc.close();
	}

}
