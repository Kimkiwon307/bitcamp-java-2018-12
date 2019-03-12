// reflection API - 특정 메서드만 조회하기
package ch27.b;

import java.lang.reflect.Method;

public class Test04 {

	public static void main(String[] args) throws Exception{

		Class<?> clazz = C.class;

		//메서드명과 파라미터 타입으로 메서드 정보를 알아낼 수 있따.
		Method m =  clazz.getMethod("plus", int.class, int.class);
		System.out.println(m.getName());

		m = clazz.getMethod("c_public");
		System.out.println(m.getName());

	}

}
