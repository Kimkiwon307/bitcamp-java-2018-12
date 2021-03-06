// reflection API - 클래스가 갖고 있는 메서드 정보 알아내기 , 클래스 안을 들여다 볼떄 사용하는 도구
package ch27.b;

import java.lang.reflect.Method;

public class Test03 {

	public static void main(String[] args) {

		Class<?> clazz = C.class;
		
		Method[] methods = clazz.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		System.out.println("--------------------------");
		methods = clazz.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	
	}

}
