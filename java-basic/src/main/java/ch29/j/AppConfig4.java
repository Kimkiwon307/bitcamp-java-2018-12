package ch29.j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import ch29.j2.sub1.sub1Car;

//@Configuration  스프링 IoC컨테이너에게 이클래스를 직접알려주기 떄문에 이 애노태이션은 피료없다
@ComponentScan(basePackages="ch29.j2")
		
public class AppConfig4 {

	//애노테이션을 사용할수 없는 경우 다음과 같이 수동으로 객체를 생성할수잇다
	// 이때 @Bean 애노태이션을 붙여 스프링 IoC컨테이너에게 알려줘야한다
	@Bean
	public BlackBox blackBox() {
		BlackBox obj = new BlackBox();
		obj.setMaker("비트박스");
		obj.setModel("비트비트");
		return obj;
	}
	
	//스프링 IoC 컨테이너로부터 개겣를 주입바고 싶다면 파라미터에 선언하라
	@Bean
	public Car car1(sub1Car sub1Car) {
		Car obj = new Car();
		obj.setMaker("비트자동차");
		obj.setModel("모ㅔㄷㄹ1");
		obj.setAuto(true);
		obj.setBlackBox(sub1Car.getBlackBox());
		return obj;
	}
	@Bean
	public Car car2(ApplicationContext iocContainer) {
		
		BlackBox bb = (BlackBox)iocContainer.getBean("blackBox");
		Car obj = new Car();
		obj.setMaker("비트자동차");
		obj.setModel("모ㅔㄷㄹ1");
		obj.setAuto(false);
		obj.setBlackBox(bb);
		return obj;
	}
	
	
	
}
