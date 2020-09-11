package com.hcl.example5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice : ");
		System.out.println("1)Gold Stall");
		System.out.println(	"2)Premium Stall"); 
		System.out.println(	"3)Executive Stall" );
		int n=sc.nextInt();
		sc.nextLine();
		switch(n)
		{
			case 1:
			{
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets ) :");
			String l=sc.nextLine();
			String[] input;
			input=l.split(",");
			Stall s=new GoldStall(input[0], Integer.parseInt(input[1]), input[2], Integer.parseInt(input[3]));
			s.display();
			break;
			}
			case 2:
			{
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors) :");
				String l=sc.nextLine();
				String[] input;
				input=l.split(",");
				Stall s=new PremiumStall(input[0], Integer.parseInt(input[1]), input[2], Integer.parseInt(input[3]));
				s.display();
				break;
			}
			case 3:
			{
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens) :");
				String l=sc.nextLine();
				String[] input;
				input=l.split(",");
				Stall s=new ExecutiveStall(input[0], Integer.parseInt(input[1]), input[2], Integer.parseInt(input[3]));
				s.display();
				break;
			}
			default:
			{
				System.out.println("Invalid Choice");
			}
		}
			sc.close();	
	}

}
