import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.Box;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Box b=ac.getBean("box",Box.class);
		b.display();
		((ClassPathXmlApplicationContext)ac).close();
	}

}
