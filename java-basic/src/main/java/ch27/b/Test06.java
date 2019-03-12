// reflection API - 메서드의 상세정보 꺼내기
package ch27.b;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import static java.lang.reflect.Modifier.*;

public class Test06 {

	public static void main(String[] args) throws Exception{

		Class<?> clazz =String.class;

		Method[] methods = clazz.getMethods();
		for(Method m : methods) {
			System.out.printf("클래스명:%s\n",
					m.getDeclaringClass().getSimpleName());
		System.out.println(m.getName());
			
			
			System.out.println("----------------------------------");
		}

	}

}
