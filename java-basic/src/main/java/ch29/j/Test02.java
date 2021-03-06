// Java config - @Configuration 애노테이션
package ch29.j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02 {
	public static void main(String[] args) {
		
		
		//AnnotationConfigApplicationContext 컨테이너에 패지명을 알려주면 
		// 그 패키지에 있는 @Component, @Service, @Repository, @Controller 객체를 생성한다
		// 만약 클래스들 중에서 @Configuration 애노테이션이 붙은 클래스가 있따면
		// Java config 클래스로 인식하여 자동으로 처리한다
		ApplicationContext iocContainer = 
				new AnnotationConfigApplicationContext("ch29.j");

		// @Component 에노테이션이 붙은 클래스의 인스턴스를 자동으로 생성한다.
		System.out.println("-----------------------------------------------------");
		String[] names = iocContainer.getBeanDefinitionNames();
		for(String name : names) {
			System.out.printf("%s ==> %s\n",name,iocContainer.getBean(name).getClass().getName());
		}

		
	}
}
