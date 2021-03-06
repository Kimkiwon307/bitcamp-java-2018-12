// 프로퍼티 값 변환기 - 기본 프로퍼티 값 변환기 
package ch29.g;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test04 {
	public static void main(String[] args) {

		ApplicationContext iocContainer = 
				new ClassPathXmlApplicationContext("ch29/g/application-context-04.xml");

		System.out.println("-----------------------------------------------------");
		System.out.println(iocContainer.getBean("c1"));
	}
}
