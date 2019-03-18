package practice.f;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
public static void main (String []args) {
		
		
		ApplicationContext container =
				new AnnotationConfigApplicationContext(AppConfig3.class);

		ApplicationContext container2 = 
				new ClassPathXmlApplicationContext("practice/f/application-context3.xml");
		
		
		Student2 s1 = (Student2)container.getBean("student2");
		
		Student2 s2 =(Student2)container2.getBean("student2");
		
		
		System.out.println(s1);
 }
}
