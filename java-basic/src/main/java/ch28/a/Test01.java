// 에노테이션
// => 클래스, 필드, 메서드, 로컬 변수에 붙이는 특별한 주석이다.
// => 다른 주석과 달리 컴파일이나 실행할 때 추출할 수 있다.
// => 일반 주석과 달리 프로퍼티명(속성) = 값 형태로 값을 다룰 수 있다.
// => 사용법
//	 	-애노테이션 정의 또는 기존에 정의된 애노테이션 사용



package ch28.a;

@MyAnnotation
@MyAnnotation //중복 불가
public class Test01 {

	@MyAnnotation
	static int a;
	
	@MyAnnotation
	int b;
	
	@MyAnnotation
	void m1(@MyAnnotation int p1, @MyAnnotation String p2) {
		
		@MyAnnotation int local;
		
		@MyAnnotation System.out.println("okok"); 
		
		@MyAnnotation 
		for(int i = 0; i < 100; i++) {
			@MyAnnotation int a;
		}
	}
@MyAnnotation
static void m1() {};
	
}
