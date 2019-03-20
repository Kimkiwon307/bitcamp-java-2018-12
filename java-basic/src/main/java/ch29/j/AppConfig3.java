package ch29.j;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

//@Configuration  스프링 IoC컨테이너에게 이클래스를 직접알려주기 떄문에 이 애노태이션은 피료없다
// 애노테이션으로 특정 조
@ComponentScan(
		basePackages={"ch29.j2","ch29.j"},
		excludeFilters= {@ComponentScan.Filter(type=FilterType.REGEX, pattern="ch29.j.Car"),
		                 @ComponentScan.Filter(type=FilterType.REGEX, pattern="ch29.j.AppConfig2x")}
)
public class AppConfig3 {

}
