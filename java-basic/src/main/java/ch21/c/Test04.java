// 애플리케이션 예외의 종류: Exception 계열의 예외 처리 III
package ch21.c;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Test04 {

  public static void main(String[] args) 
      //throws 문장도 catch 블록처럼 공통 수퍼 클래스 한 개로 보고할 수 있다.
      // => throws 절에는 
      throws Exception{
    
  
   /*   throws ClassNotFoundException, // 이 메서드에서 발생하는 예외의 목록을 지정한다.
             NoSuchMethodException,  // 만약 메서드를 실행하는 중에 이런 예외가 발생한다면,
             InstantiationException, // 즉시 이 메서드의 실행을 멈추고
             IllegalAccessException, // 이 메서드를 호출한 쪽에 예외 정보를 보고한다.
             InvocationTargetException{ // main()의 호출자? JVM이다
*/
    Scanner kb = new Scanner(System.in);
    Class<?> clazz = Class.forName("ch21.c.PlusCommand");
    Constructor<?> constructor = clazz.getConstructor(Scanner.class);
    Command command = (Command)constructor.newInstance(kb);
    command.execute();


  } 
}
