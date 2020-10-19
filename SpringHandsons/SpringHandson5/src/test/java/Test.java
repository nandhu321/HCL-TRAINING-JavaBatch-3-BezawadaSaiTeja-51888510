import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hcl.example5.Config;
import com.hcl.example5.Owner;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext ac= new AnnotationConfigApplicationContext(Config.class);
		Owner ow=ac.getBean("owner",Owner.class);
		String name=br.readLine();
		String password=br.readLine();
		String mobileNumber=br.readLine();
		ow.setDetails(name, password, mobileNumber);
		ow.display();
	}

}
