package practice.a;

@MyAnnotation 
//@MyAnnotation 
public class Test01 {
	@MyAnnotation
	int a;
	
	@MyAnnotation
	static int b;
	
	void m1(@MyAnnotation String a) {
		
		
	}
	
	
	@MyAnnotation
	public static void main(String [] args) {
		
		@MyAnnotation
		int local;
	}
}
// 로컬 필드 메서드 메서드파라미터 클래스 가능
// 일반 문장 불가능