import org.hcl.Course;
import org.hcl.CourseList;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Course c1=ac.getBean("course1",Course.class);
		Course c2=(Course)ac.getBean("course2");
		Course c3=(Course)ac.getBean("course3");
		
		CourseList cl=ac.getBean("courseList",CourseList.class);
		cl.insert(c1);
		cl.insert(c2);
		cl.insert(c3);
		cl.revenue();
		((ClassPathXmlApplicationContext)ac).close();
	}

}
