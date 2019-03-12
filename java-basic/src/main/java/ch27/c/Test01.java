// reflection API - 인스턴스 생성하기
package ch27.c;

import java.lang.reflect.Constructor;

public class Test01 {

	public static void main (String[] arsg) throws Exception{

		Class<?> clazz = Class.forName("ch27.c.Student");

		// 클래스 정보를 가지고 인스턴스 생성하기(deprecated)
		Student s1 = (Student)clazz.newInstance();

		@SuppressWarnings("unchecked")
		Constructor<Student> c1 = (Constructor<Student>)clazz.getConstructor();
		Student s2 = (Student)c1.newInstance();


		@SuppressWarnings("unchecked")
		Constructor<Student> c2 = 
		(Constructor<Student>)clazz.getConstructor(String.class, String.class);


		Student s3 = c2.newInstance("홍길동","hong@" );
		System.out.println(s3);	









	}
}
