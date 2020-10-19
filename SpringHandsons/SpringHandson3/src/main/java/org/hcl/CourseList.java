package org.hcl;

import java.util.ArrayList;

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
	public void revenue() {
		double revenue = 0;
		double tot =0;
		for(Course c : al) {
			tot= 0.2 * c.getFee()*200;
			revenue=revenue+tot;
		}
		System.out.println("Total Revenue : "+revenue );
	}

}
