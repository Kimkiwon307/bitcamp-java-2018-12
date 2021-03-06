// @Component - 스프링 IoC 컨테이너가 관리할 객체에 붙이는 에노테이션
package ch29.i;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {

		ApplicationContext iocContainer = 
				new ClassPathXmlApplicationContext("ch29/i/application-context-01.xml");

		// @Component 에노테이션이 붙은 클래스의 인스턴스를 자동으로 생성한다.
		System.out.println("-----------------------------------------------------");
		String[] names = iocContainer.getBeanDefinitionNames();
		for(String name : names) {
			System.out.printf("%s ==> %s\n",name,iocContainer.getBean(name).getClass().getName());
		}

		System.out.println("-----------------------------------------------------");
		System.out.println(iocContainer.getBean("car"));
		
	}
}
