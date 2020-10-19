package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e=(Employee)ac.getBean("emp1");
		e.display();
		System.out.println("\n");
		Employee e1=(Employee)ac.getBean("emp2");
		e1.display();

	}

}
