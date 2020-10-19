package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Test {

	public static void main(String[] args) throws IOException {
		ArrayList<String> al=new ArrayList<String>();
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext ac= new AnnotationConfigApplicationContext(Config.class);
		Employee e=ac.getBean("employee",Employee.class);
		
		System.out.println("Enter the employee name : ");
		String name=br.readLine();
		
		System.out.println("Enter the no of Mobile numbers  :");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			String f=br.readLine();
			al.add(f);		}
		System.out.println("enter the Salary : ");
		long salary=Long.parseLong(br.readLine());
		System.out.println("enter the email : ");
		String email=br.readLine();
		e.setEmployeeName(name);
		e.setEmployeeMobileNumber(al);
		e.setEmployeeEmail(email);
		e.setEmployeeSalary(salary);
		System.out.println("Enter the line1 Address : ");
		String line1=br.readLine();
		System.out.println("Enter the line2 Address :");
		String line2=br.readLine();
		System.out.println("Enter the city :");
		String city=br.readLine();
		System.out.println("Enter the pincode");
		String pincode=br.readLine();
		Address a= ac.getBean("address",Address.class);
		a.setLine1(line1);
		a.setLine2(line2);
		a.setCity(city);
		a.setPincode(pincode);
		
		e.display();
		((ClassPathXmlApplicationContext)ac).close();
	}
	
	

}
