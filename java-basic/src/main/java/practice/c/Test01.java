package practice.c;

@MyAnnotation
public class Test01 {
	
	@MyAnnotation2
	int a ;
	
	@MyAnnotation2
	static int b;
		
	@MyAnnotation3
	void m1() {
		@MyAnnotation4
		int a;
		
	}
	
	@MyAnnotation3
	public static void main(String [] args) {
		@MyAnnotation4
		int a;
		
	}
}
