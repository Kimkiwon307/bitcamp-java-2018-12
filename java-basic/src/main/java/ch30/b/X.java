
package ch30.b;

import org.springframework.stereotype.Component;

@Component
public class X {
	
	public void m1() {
		//m1() 메서드를 실행하기 전에 기능을 추가하기
		// => 다음과 같이 직접 해당 기능을 수행하는 코드를 삽입해야 한다.
		
		MyAdvice myAdvice = new MyAdvice();
		myAdvice.advice1();
		
		//이렇게 어떤 메서드를 실행하기 전이나 후에 기능을 추가하고 싶다면
		// 해당 메서드를 찾아가서 코드를 편집해야 한다.
		
		// 이 고전적인 방식의 문제점?
		
		System.out.println("X.m1()");
	}
}
