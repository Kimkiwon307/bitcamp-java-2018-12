package ch29.j;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
// => AnnotationConfigApplicationContext 컨테이너에 java config 클래스를 직접 지정할 경우에는
//		굳이 @Configuration 애노테이션을 붙일 필요가없다.
//		

@Configuration
@ComponentScan("ch29.j2")
public class AppConfig2 {

}
