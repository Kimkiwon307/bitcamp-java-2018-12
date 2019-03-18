package practice.f;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch29.a.AppConfig;

public class Test01 {
public static void main (String []args) {
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("practice/f/application-context.xml");
		
		
		ApplicationContext container1 =
				new AnnotationConfigApplicationContext(AppConfig.class);

		
 }
}
