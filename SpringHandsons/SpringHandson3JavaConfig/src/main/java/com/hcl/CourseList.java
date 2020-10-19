package com.hcl;

import java.util.ArrayList;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CourseList {
	ArrayList<Course> a=new ArrayList<Course>();
	public void insert(Course course)
	{
		a.add(course);
		
		
	}
	public void revenue() {
		double revenue = 0;
		double tot =0;
		for(Course c : a) {
			tot= 0.2 * c.getFee()*200;
			revenue=revenue+tot;
		}
		System.out.println("Total Revenue : "+revenue );
	}

	
}
