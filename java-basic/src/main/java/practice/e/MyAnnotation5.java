package practice.e;



public  @interface MyAnnotation5 {
	String value() ;
	String name() default "홍길동";
	int age() default 10;
	boolean working() default true;// 필수 프로퍼티, 이름생략불가
}
