package ch29.j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource({"classpath:ch29/j/jdbc.properties",
				   "classpath:ch29/j/jdbc2.properties"})
public class AppConfig5 {

	@Autowired
	Environment env;
	
	//@PropertySource를 통해 로디오딘 프로퍼티 값 중에서 특정 값만 필드로 주입 받을 수 있따.
	// => 필드에 @Value 애노테이션을 붙인다.
	// => @Value
	@Value("${jdbc.url}")
	String jdbcUrl;
	
	@Value("${jdbc2.url}")
	String jdbc2Url;
	
	@Bean
	public Car car1() {
		System.out.println("car1() 호출:");
		System.out.println(env.getProperty("jdbc.url"));
		System.out.println(env.getProperty("jdbc2.url"));
		return new Car();
	}
	@Bean
	public Car car2() {
		System.out.println("car2() 호출:");
		System.out.println(this.jdbcUrl);
		System.out.println(this.jdbc2Url);
		return new Car();
	}
	
	@Bean
	public Car car3(@Value("${jdbc.username}") String username,
			           @Value("${jdbc.password}") String password){
		System.out.println("car3() 호출:");
		System.out.println(username);
		System.out.println(password);
		return new Car();
	}
	
	
}
