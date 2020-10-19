import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.Course;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Course c1=ac.getBean("course1",Course.class);
		Course c2=ac.getBean("course2",Course.class);
		Course c3=ac.getBean("course3",Course.class);
		System.out.println(c1+"\n"+c2+"\n"+c3);
		((ClassPathXmlApplicationContext)ac).close();
	}
}
