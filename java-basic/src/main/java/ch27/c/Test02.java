// reflection API - 메서드 호출하기
package ch27.c;

import java.lang.reflect.Method;

public class Test02 {

	public static void main (String[] arsg) throws Exception{

		Student s1 = new Student("홍길동", "hong@naver.com",true,25);

		//setName()호출하기
		Method m1 = s1.getClass().getMethod("setName",String.class);

		m1.invoke(s1, "임꺼정"); // => s1.setName("임꺽정");
		System.out.println("s1");

		Method m2 = s1.getClass().getMethod("greeting", 
				String.class,int.class,boolean.class);

		String str = (String) m2.invoke(null, "유관순",17,true);
		System.out.println(str);

	}
}
