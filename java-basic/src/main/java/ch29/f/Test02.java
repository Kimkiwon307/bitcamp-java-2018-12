//팩토리 클래스를 통해 객체 생성하기
package ch29.f;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test02 {
	public static void main(String[] args) {

		ApplicationContext iocContainer = 
				new ClassPathXmlApplicationContext("ch29/f/application-context-02.xml");

		System.out.println("-----------------------------------------------------");
		System.out.println(iocContainer.getBean("c1"));
		System.out.println(iocContainer.getBean("carFactory"));
	}
}
