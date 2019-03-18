package practice.f;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch29.a.AppConfig;

public class Test02 {
public static void main (String []args) {
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("practice/f/application-context2.xml");
		
		
		ApplicationContext container1 =
				new AnnotationConfigApplicationContext(AppConfig2.class);

		Student s1 = (Student)container1.getBean("gg");
		
		Student s2 =(Student )container.getBean("dd");
		System.out.println(s1);
		System.out.println(s2);
 }
}
