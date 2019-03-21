package ch30.f;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// 지정된 객체의 메서드를 호출할 때,
// => 메서드 호출 전이나 후에 어떤 작업을 수행하는 일을 한다.


@Component
@Aspect
public class MyAdvice {

	@Pointcut("execution(* ch30.f.X.*(..))")
	public void calculatorOperation() {}

	@Before("calculatorOperation() and args(p1,p2,p3)" )
	public void doBefore(int p1, int p2, String p3) {
		System.out.printf("%s.doBefore()\n", this.getClass().getName());
		System.out.printf("  => %d %d %s\n",p1,p2,p3);
	}

	@After("calculatorOperation()")
	public void doAfter() {
		System.out.printf("%s.doAfter()\n", this.getClass().getName());
	}

	@AfterReturning(pointcut="calculatorOperation()",returning="rv")
	public void doAfterReturning(Object rv) {
		System.out.printf("%s.doAfterReturning()\n", this.getClass().getName());
		System.out.printf("  => %d\n",rv);
	}

	@AfterThrowing(pointcut="calculatorOperation()",throwing="err")
	public void doAfterThrowing(Exception err) {
		System.out.printf("%s.doAfterThrowing()\n", this.getClass().getName());
		System.out.printf(" => %s\n", err.getMessage());
	}

}
