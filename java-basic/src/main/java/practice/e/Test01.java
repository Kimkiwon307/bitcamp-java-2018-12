package practice.e;

import java.lang.annotation.Annotation;

@MyAnnotation7(name = "홍길동", age = 5)
public class Test01 {
	
	public static void main(String [] args) {
	
		Annotation[] annotations = Test01.class.getAnnotations();
	    for(Annotation a : annotations) {
	    	System.out.println(a);
	    	
	    }
	    // 클래스에서 애노테이션을 배열을 받았을 경우 형변환해서 사용하면 
	    // 애노테이션의 프로퍼티 값을 추출할 수 있다.
	    MyAnnotation7 anno3 = (MyAnnotation7) annotations[0]; 
	    for (String s : anno3.value()) 
	      System.out.println("==> " + s);
	    System.out.println(anno3.name());
	    System.out.println(anno3.age());
	    System.out.println(anno3.working());
	    System.out.println("-----------------------------");
	
	}
}
