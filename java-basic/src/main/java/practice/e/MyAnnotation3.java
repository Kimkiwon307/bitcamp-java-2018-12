package practice.e;



public  @interface MyAnnotation3 {
	String value() default "오호라"; // 필수 프로퍼티, 이름생략불가
}
