// try-with-resources 문법 : 문법 확인
package ch21.f;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class Test03 {


  static class MyResource1 {
    public void close() {
      System.out.println("MyResource1.close()");
    }
  }

  static class MyResource2 implements AutoCloseable {
    @Override
    public void close() {
      System.out.println("MyResource2.close()");
    }
    public int diveide(int a, int b) {
      return a / b;
    }
  }

  public static void main(String[] args) {

    try(
        //java.lang.AutoCloseable을 구현하지 않은 객체는 선언할 수 없다.
        //       MyResource1 r1 = new MyResource1(); 컴파일 오류

        //java.lang.AutoCloseable을 구현한 객체는 선언할 수 있따.
        MyResource2 r2 = new MyResource2();

        ){
      System.out.println(r2.diveide(10, 2));
      System.out.println(r2.diveide(10, 0));

      //try 블록을 벗어나기 전에 close()가 자동호출된다

    }catch (Exception e) {
      System.out.println("예외발생");
    }
  }

}





