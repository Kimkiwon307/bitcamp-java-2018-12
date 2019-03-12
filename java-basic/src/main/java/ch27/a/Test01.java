// 인터페이스 구현체를 자동으로 생성하기
package ch27.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class Test01 {

	public static void main(String[] args) {
//		String s ="hello";
//		Class<?>c1 = String.class;
//		Class<?>c2 = s.getClass();
// 		Class<?>c3 = Class.forName("java.lang.String");	
		
		class MyHandler implements InvocationHandler{
		@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

			int a =(int) args[0];
			int b =(int) args[1];
			switch(method.getName()) {
			case "plus":
				return a+b;
			case "minus":
				return a-b;
				
			}
			return 0;
		 }	
		}
		
		//클래스 정보를 가리킨다 => (클래스or인터페이스의 스택틱 변수) = .class
//		Class<?> []classes = new Class[] {Calculator.class};
		
		Calculator c1 = (Calculator)Proxy.newProxyInstance(
				Test01.class.getClassLoader(),
				new Class[] {Calculator.class},
			new MyHandler());
		System.out.println(Test01.class.getClassLoader());
		System.out.println(c1.plus(111, 20));
		System.out.println(c1.minus(10,20));
	}

}
