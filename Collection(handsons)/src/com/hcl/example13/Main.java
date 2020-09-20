package com.hcl.example13;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		 final int MAX=100;
		 ArrayList<ArrayList<Integer> > aList =  new ArrayList<ArrayList<Integer> >(5);
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 ArrayList<Integer> a=new ArrayList<>();

		 System.out.println("On the day one");
		 String l=br.readLine();
		 String[] li=l.split(",");
		 for(int i=0;i<li.length;i++)
		 {
			 a.add(Integer.parseInt(li[i])) ;
		 }
		 aList.add(a);
		 ArrayList<Integer> a1=new ArrayList<>();

		 System.out.println("On the day Two");
		 String l1=br.readLine();
		 String[] li1=l1.split(",");
		 for(int i=0;i<li1.length;i++)
		 {
			 a1.add(Integer.parseInt(li1[i])) ;
		 }
		 aList.add(a1);
		 ArrayList<Integer> a2=new ArrayList<>();

		 System.out.println("On the day Three");
		 String l2=br.readLine();
		 String[] li2=l2.split(",");
		 for(int i=0;i<li2.length;i++)
		 {
			 a2.add(Integer.parseInt(li2[i])) ;
		 }
		 aList.add(a2);
		 ArrayList<Integer> a3=new ArrayList<>();

		 System.out.println("On the day Four");
		 String l3=br.readLine();
		 String[] li3=l3.split(",");
		 for(int i=0;i<li3.length;i++)
		 {
			 a3.add(Integer.parseInt(li3[i])) ;
		 }
		 aList.add(a3);
		 ArrayList<Integer> a4=new ArrayList<>();

		 System.out.println("On the day Fve");
		 String l4=br.readLine();
		 String[] li4=l4.split(",");
		 for(int i=0;i<li4.length;i++)
		 {
			 a4.add(Integer.parseInt(li4[i])) ;
		 }
		 aList.add(a4);
		 String o;
		 do {
			 System.out.println("Enter the day to know its remaining ticket count:");
			 int k=Integer.parseInt(br.readLine());
			  
				 
			  System.out.print("Reamining Tickets: [");
		            for (int j = 0; j < aList.get(k-1).size(); j++) { 
		            	if((j+1)==aList.get(k-1).size())
		            	{
		            		System.out.print((MAX-aList.get(k-1).get(j))) ;
		            	}
		            		else
		            		{
		            			 System.out.print((MAX-aList.get(k-1).get(j)) + ","); 
		            		}
		            	
		               
		 }
		            System.out.println("]\n");
		            System.out.println("Do u want to continue (y/n) ? ");
		          o =br.readLine();
		            
	}while(o.equals("y"));

}
}