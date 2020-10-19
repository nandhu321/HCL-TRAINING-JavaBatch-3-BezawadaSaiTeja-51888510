import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example4.Course;
import com.hcl.example4.CourseList;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	Course c1=ac.getBean("course1",Course.class);
	Course c2=ac.getBean("course2",Course.class);
	Course c3=ac.getBean("course3",Course.class);
	CourseList cl=ac.getBean("courseList", CourseList.class);
	cl.insert(c1);
	cl.insert(c2);
	cl.insert(c3);
	cl.discount();
	((ClassPathXmlApplicationContext)ac).close();
	}

}
