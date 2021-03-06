// 객체 생성
package practice.g;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
	
		ApplicationContext iocContainer = 
				new ClassPathXmlApplicationContext("practice/g/application-context-01.xml");
		
		System.out.println("-----------------------------------------------------");
		// 스프링 IoC 컨테이너에 보관된 객체 꺼내기
		String[] names = iocContainer.getBeanDefinitionNames();
		for(String name : names) {
			System.out.printf("%s ==> %s\n",name, iocContainer.getBean(name).getClass().getName());
		}
		System.out.println("실행 완료");


	}
}
