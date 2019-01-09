// 흐름제어문 - do while 반복문

package ch05;

public class Test12{

  public static void main(String[] args) {
    int i = 1;
    do
      System.out.println(i+"");
    while (i++ < 10); //후위 연산
    System.out.println();

    i = 0;
    do {

      System.out.print(++i); // 전위 연산자
      System.out.print(",");
    }while(i < 10);
    System.out.println();


  }
}

