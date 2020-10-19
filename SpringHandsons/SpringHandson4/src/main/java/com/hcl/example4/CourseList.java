package com.hcl.example4;

import java.util.ArrayList;
import java.util.Collections;

public class CourseList {
	private ArrayList<Course> al=new ArrayList<Course>();

	public CourseList() {
	}
	public CourseList(ArrayList<Course> al) {
		super();
		this.al = al;
	}
	public void insert(Course course)
	{
		this.al.add(course);
	}
	public void discount() {
		ArrayList<Double> a=new ArrayList<Double>();
		for(Course c:al)
		{
			a.add(c.getFee());
		}
		double min1=Collections.min(a);
		double max1=Collections.max(a);
		String s1=null,s2=null;
		for(Course c:al)
		{
			if(max1==c.getFee())
			{
				s1=c.getName();
			}
			if(min1==c.getFee())
			{
				 s2=c.getName();
			}
		}
		
		System.out.println("Discount "+(max1*0.1)+" For "+s1+" Course");
		System.out.println("Discount "+(min1*0.05)+" For "+s2+" Course");
		}
		

}
