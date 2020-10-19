package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Course c1=ac.getBean("course1",Course.class);
		Course c2=(Course)ac.getBean("course2");
		Course c3=(Course)ac.getBean("course3");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		CourseList cl=ac.getBean("courseList",CourseList.class);
		cl.insert(c1);
		cl.insert(c2);
		cl.insert(c3);
		System.out.println("Enter your Budget");
		double fee=Double.parseDouble(br.readLine());
		ArrayList<String> as=cl.noOfCourses(fee);
		if(as.size()>=1) {
			for (String string : as) {
				System.out.println(string);
			}
		}
		else
		{
			System.out.println("No Course Available");
		}
			
		
		((ClassPathXmlApplicationContext)ac).close();
	}
}
