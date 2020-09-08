package com.hcl.example4;

import java.util.Scanner;

public class Test3 {

	static int product_code;
	static String product_name;
	static double price;
	static int stock;

	public static Product3 buildProduct() {
		Scanner sc = new Scanner(System.in);

		Product3 p = new Product3();

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
		Scanner sc1 = new Scanner(System.in);
		int n;
		int s = 0;

		Product3[] p1 = new Product3[5];
		do {
			System.out.println("   Menu   ");
			System.out.println("1. Add Products");
			System.out.println("2. Display Products");
			System.out.println("3. Get Discounted Price");
			System.out.println("4. Find Costly Product");
			System.out.println("5. Check Min Stock");
			System.out.println("6. Exit");
			System.out.println("enter the choice :");
			n = sc1.nextInt();

			if (n == 1) {
				System.out.println("enter the no of products to add : \n");
				s = sc1.nextInt();
				for (int i = 0; i < s; i++) {
					p1[i] = buildProduct();
				}
			} else if (n == 2) {
				for (int j = 0; j < s; j++) {
					System.out.println("\nProduct Details : \n");
					System.out.println("L & K SUPPLIERS");
					System.out.println("Product Code : " + p1[j].getProduct_code());
					System.out.println("Name : " + p1[j].getProduct_name());
					System.out.println("Price : " + p1[j].getPrice());
					System.out.println("Stock : " + p1[j].getStock());
				}
			} else if (n == 3) {
				System.out.println("\nDiscounted Price of products");
				System.out.println("Product Name       Discounted Price");
				for (int j = 0; j < s; j++) {
					System.out.println(p1[j].getProduct_name() + "\t\t\t" + p1[j].getDiscountedPrice());
				}
			} else if (n == 4) {
				System.out.println("\n" + Product3.checkPrice(p1, s));
			} else if (n == 5) {
				System.out.println("\nThe Product with min stock : ");
				System.out.println("\nL & K SUPPLIERS");
				System.out.println(Product3.checkLessStock(p1, s));
			} else {
				break;
			}
		} while (n <= 6);

		sc1.close();

	}

}
