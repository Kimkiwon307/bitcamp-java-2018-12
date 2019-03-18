// 프로퍼티 값 설정 - 의존객체 주입
package ch29.d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test03 {
	public static void main(String[] args) {

		ApplicationContext iocContainer = 
				new ClassPathXmlApplicationContext("ch29/d/application-context-03.xml");

		System.out.println("-----------------------------------------------------");
		
		// 다른 객체의 프로퍼티에서 생성한 객체는 별도로 꺼낼 수 없다.
		
		BlackBox bb1 = (BlackBox)iocContainer.getBean("bb1"); 
		Car c1 = (Car)iocContainer.getBean("c1");
//		Car c2 = (Car)iocContainer.getBean("c2");
		Car c3 = (Car)iocContainer.getBean("c3");
		
		System.out.println(bb1);
		System.out.println(c1);
//		System.out.println(iocContainer.getBean("c2"));
		System.out.println(c3);
	}
}
