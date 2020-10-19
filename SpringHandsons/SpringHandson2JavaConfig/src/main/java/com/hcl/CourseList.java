package com.hcl;

import java.util.ArrayList;
import java.util.Iterator;

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
	public ArrayList<String> noOfCourses(double fee)
	{
		ArrayList<String> al=new ArrayList<String>();
		Iterator<Course> itr=a.iterator();
		while(itr.hasNext())
		{
			Course c=(Course)itr.next();
			
			if(c.getFee()==fee)
			{
				al.add(c.getName());
			}
		}
		return al;
	}
	
}
