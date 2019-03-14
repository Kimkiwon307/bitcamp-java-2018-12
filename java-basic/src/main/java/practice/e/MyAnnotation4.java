package practice.e;



public  @interface MyAnnotation4 {
	String value() ;
	String name();
	int age();
	boolean working();// 필수 프로퍼티, 이름생략불가
}
