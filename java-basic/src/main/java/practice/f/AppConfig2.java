package practice.f;

import org.springframework.context.annotation.Bean;

public class AppConfig2 {
	@Bean("gg")
	public Student aa() {
		return new Student();
	}
}
