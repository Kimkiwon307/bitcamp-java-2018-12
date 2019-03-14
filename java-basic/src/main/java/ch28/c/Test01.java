// 에노테이션 사용범위


package ch28.c;

import java.lang.annotation.Annotation;

@MyAnnotation  // 클래스
//@MyAnnotation2  필드
//@MyAnnotation3  메서드
//@MyAnnotation4  로컬변수
public class Test01 {



	//	@MyAnnotation  // 클래스
	@MyAnnotation2  //필드
	//	@MyAnnotation3  메서드
	//	@MyAnnotation4  로컬변수
	int a;
	
	
	//	@MyAnnotation  // 클래스
	@MyAnnotation2 // 필드
	//	@MyAnnotation3  메서드
	//	@MyAnnotation4  로컬변수
	static int b;

	//	@MyAnnotation  // 클래스
	//	@MyAnnotation2  필드
	@MyAnnotation3 // 메서드
	//	@MyAnnotation4  로컬변수
	public static void main(String[] args) {

		//		@MyAnnotation  // 클래스
		//		@MyAnnotation2 // 필드
		//		@MyAnnotation3 // 메서드
		@MyAnnotation4 // 로컬변수
		int local;

	}
}
