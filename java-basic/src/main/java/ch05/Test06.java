            // 흐름 제어문 - switch 과 enum

package ch05;

public class Test06{
  static enum UserType {
    MANAGER, MEMBER, GUEST
};
  public static void main(String[] args) {
       //상수 정의 문법 
    UserType type = UserType.MANAGER;
     // switch 의 조건으로 상수를 의미하는 enum 값이 올 수 있다.
     switch(type) {
        case MEMBER:
            System.out.println("일반 회원 입니다");
            break;
        case MANAGER:  
           System.out.println("관리자 입니다");
           break;
        case GUEST:
            System.out.println("손님 입니다.");
            break;
        default:
           System.out.println("유효하지 않은 사람입니다.");
            
      }
    }
 }

