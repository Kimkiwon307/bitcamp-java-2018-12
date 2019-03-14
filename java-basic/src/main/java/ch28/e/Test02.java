// 에노테이션 프로퍼티
// => 메서드 선언하는 문법과 비슷하다.
// => 기본 값을 지정하지 않으면 필수 입력이다.
// => 
package ch28.e;

//@MyAnnotation 
public class Test02 {
	@MyAnnotation4(
			value="okok",
			name = "홍길동",
			age = 20,
			working = true)
	int a;
	
	@MyAnnotation4(
			"okok",
			name = "홍길동",
			age = 20,
			working = true)
	int b;
	
	@MyAnnotation5("okok")
	int c;
	
	
	
	
}
