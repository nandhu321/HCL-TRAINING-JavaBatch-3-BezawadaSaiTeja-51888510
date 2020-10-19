

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.hcl.Config;
import com.hcl.Course;
import com.hcl.CourseList;

public class Test {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		
		
		CourseList cl=ac.getBean("courseList",CourseList.class);
		System.out.println("Enter the no of courses");
		int n=Integer.parseInt(br.readLine());
		String name=null,mentor=null;
		double fee;
			for(int i=0;i<n;i++)
			{
		
			Course c1=ac.getBean("course",Course.class);
			System.out.println("Enter the name : ");
			name=br.readLine();
			c1.setName(name);
			System.out.println("Enter the mentor Name  : ");
			mentor=br.readLine();
			c1.setMentor(mentor);
			System.out.println("enter the fee");
			fee=Double.parseDouble(br.readLine());
			c1.setFee(fee);
			cl.insert(c1);
			}
			
		
		System.out.println("Enter your Budget");
		double fee1=Double.parseDouble(br.readLine());
		ArrayList<String> as=cl.noOfCourses(fee1);
		if(as.size()>=1) {
			for (String string : as) {
				System.out.println(string);
			}
		}
		else
		{
			System.out.println("No Course Available");
		}
			
		((AnnotationConfigApplicationContext)ac).close();
		
	}
}
