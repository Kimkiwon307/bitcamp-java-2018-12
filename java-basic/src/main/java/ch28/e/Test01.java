// 에노테이션 프로퍼티
// => 메서드 선언하는 문법과 비슷하다.
// => 기본 값을 지정하지 않으면 필수 입력이다.
// => 
package ch28.e;

//@MyAnnotation 
public class Test01 {
	@MyAnnotation(value="okok")
	int a;
	
	@MyAnnotation("okok")
	int b;
	
	@MyAnnotation2(value2 = "okok")
	int c;
	
	@MyAnnotation2("okok")
	int d;
	
	@MyAnnotation3(value = "okok")
	int e;
	
	@MyAnnotation3()
	int f;

	@MyAnnotation3
	int g;

}
