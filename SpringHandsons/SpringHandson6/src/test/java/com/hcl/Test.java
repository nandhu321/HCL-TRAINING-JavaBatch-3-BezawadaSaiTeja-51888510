package com.hcl;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Test {

	public static void main(String[] args)  {
	
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e=ac.getBean("emp1",Employee.class);
		
	
		
		
		
		e.display();
		((ClassPathXmlApplicationContext)ac).close();
	}
	
	

}
