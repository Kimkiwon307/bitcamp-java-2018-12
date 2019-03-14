// 에노테이션 유지범위
// => CLASS : .class 파일까지는 유지 된다. 그러나 runtime에는 메모리에 로딩되지 안흔다.
// => SOURCE : 컴파일 할 떄 제거된다. .class 파일에 포함되지 안흔ㄴ다.

package ch28.b;

import java.lang.annotation.Annotation;

@MyAnnotation 
@MyAnnotation2
@MyAnnotation3
public class Test01 {
	public static void main(String[] args) {
		
		Class<?> clazz = Test01.class;
		Annotation[] annotations = clazz.getAnnotations();
		
		// MyAnnotation은 유지 범위가 CLASS 이기 때문에 실행할 때 메모리에 로딩되지 않는다.
		// 따라서 실행 중에 애노테이션 정보를 추출할 수 없다.
		// 그러나 MyAnnotation3는 유지 범위가 RUNTIME 이기 때문에 실행 할때 메모리에 로딩된다.
		// 따라서 실행 중에 에노테이션 정보를 추출할 수 있다.
		for(Annotation a : annotations) {
			System.out.println(a.annotationType().getName());
		}
		
	}
}
