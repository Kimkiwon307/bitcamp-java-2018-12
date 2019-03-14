package practice.b;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MyAnnotation3("sibal")
public class Test01 {
	public static void main(String [] args) {
		
		Class<?>clazz = Test01.class;
		MyAnnotation3 a = clazz.getAnnotation(MyAnnotation3.class);
		System.out.println(a.value());
		System.out.println(clazz.getName());
	}
}
//유지범위 결정하기

//@Retention(RetentionPolicy.RUNTIME)
