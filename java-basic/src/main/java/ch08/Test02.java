
//클래스 로딩과 클래스 필드의 생성 , Method area의 관계
package ch08;

class My2 {
//클래스 필드
static String manager = "관리자";
static String member = "회원";
static String guest = "손님";

// 인스턴스 필드
String name;
int age;
String userType;
}

public class Test02{
public static void main(String[] args) {
 System.out.println(My2.manager);
 System.out.println(My2.member);
}
}