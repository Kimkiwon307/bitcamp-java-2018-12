//예외 던지기 -  예외를 보고하지 않는 경우
package ch21.d;

import java.util.ArrayList;

public class Test01 {
  static ArrayList<String> list = new ArrayList<>();

  public static void main(String[] args) {
    addName("홍길동");
    addName("유관순");
    addName("페이커");

    //예외를 처리하지 않는 경우
    //=> RuntimeException 예외라면 try~catch로 예외를 처리하지않으면 Jvm에게 전달
    //   그러면 프로그램 멈춘다.
    System.out.println(getName(0));
    System.out.println(getName(1));
    System.out.println(getName(2));
    System.out.println(getName(3)); //예외 발생 즉시보고 즉시종료

    System.out.printf("입력된 이름 개수는 %d 입니다\n",list.size());
  }

  static void addName(String name) {
    list.add(name);
  }

  // 1) 예외상황을 보고하지 않는 경우
  static String getName(int index) {
    return list.get(index);
  }



}
