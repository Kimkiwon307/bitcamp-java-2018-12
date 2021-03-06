
package ch30.g;

import org.springframework.stereotype.Component;

@Component
public class X {
	
	public String hello(String name) {
		System.out.println("X.hello()");
		return name + " 님 반갑";
	}

	public int calculate(int i, int j, String op) {
		System.out.println("X.calculate()");
		switch (op) {
		case "+" : return i + j;
		case "-" : return i - j;
		case "*" : return i * j;
		case "/" : return i / j;
		default :
			throw new RuntimeException("지원 안함");
		}
	}

}
