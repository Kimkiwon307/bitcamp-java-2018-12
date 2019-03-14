// 에노테이션 반복 사용
// => @Repeatable 을 사용하여 반복 사용 ㅇ여부 호가인
package ch28.d;

@MyAnnotation
//@MyAnnotation // 기본으로 한선언에 중복 사용불가
@MyAnnotation2
@MyAnnotation2
@MyAnnotation2
public class Test01 {



	public static void main(String[] args) {


	}
}
