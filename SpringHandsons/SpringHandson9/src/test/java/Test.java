import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		User u=ac.getBean("user",User.class);
		u.display();
		((ClassPathXmlApplicationContext)ac).close();
	}

}
