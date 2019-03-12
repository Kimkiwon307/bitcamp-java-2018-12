// reflection API - 메서드의 상세정보 꺼내기
package ch27.b;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import static java.lang.reflect.Modifier.*;

public class Test05 {

	public static void main(String[] args) throws Exception{

		Class<?> clazz =String.class;

		Method[] methods = clazz.getDeclaredMethods();
		for(Method m : methods) {
			System.out.printf("메서드명:%s.%s\n",
					m.getDeclaringClass().getSimpleName(),
					m.getName());

			System.out.printf("파라미터 갯수:%d\n",m.getParameterCount());
			Parameter[] params = m.getParameters();
			for(Parameter p : params) {
				System.out.printf("      %s:%s\n",
						p.getName(),
						p.getType().getName()
						);
			}

			System.out.println("리턴 타입:");
			System.out.printf("       %s\n",m.getReturnType());

			System.out.println("접근 제어:");
			int modifieres = m.getModifiers();
	
			if(Modifier.isPublic(modifieres)) //(modifieres & Modifier.PUBLIC) == Modifier.PUBLIC
				System.out.println("     public");
			
			else if((modifieres & Modifier.PROTECTED) == Modifier.PROTECTED)
				System.out.println("     protected");
			
			else if((modifieres & Modifier.PRIVATE) == Modifier.PRIVATE)
				System.out.println("     private");
			
			if((modifieres & STATIC) != 0)
				System.out.println("    static");
			
			if((modifieres & FINAL) != 0 )
				System.out.println("    final");
			
			
			System.out.println("----------------------------------");
		}

	}

}
