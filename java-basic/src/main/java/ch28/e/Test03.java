// 에노테이션 프로퍼티
// => 메서드 선언하는 문법과 비슷하다.
// => 기본 값을 지정하지 않으면 필수 입력이다.
// => 
package ch28.e;

//@MyAnnotation 
public class Test03 {
	@MyAnnotation6(value = {"aaa"})
	int a;

	@MyAnnotation6({"aaa"})
	int b;
	
	@MyAnnotation6("aaa")
	int c;
	
//	@MyAnnotation6("aaa","bbb")
//	int d;
	
	@MyAnnotation6({"aaa","bbb"})
	int e;
	
}
