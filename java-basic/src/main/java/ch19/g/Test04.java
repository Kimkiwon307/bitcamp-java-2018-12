// 파일 필터 클래스를 로컬 클래스로 만든다.
package ch19.g;

import java.io.File;
import java.io.FilenameFilter;

public class Test04 {

  // 이 클래스는 내부에서만 사용할 클래스라면 이렇게 중첩 클래스로 만드는 것이 유지보수에 좋다.
  public static void main(String[] args) {

    class MyFileNameFilter implements FilenameFilter{
      @Override
      public boolean accept(File dir, String name) {
        if(name.endsWith(".txt"))
          return true;
        else
          return false;
      }
    }
    File dir = new File("./"); // 이클립스에서 실행하면 ./는 프로젝트 디렉토리를 가리킨다.

    // 필터 클래스가 같은 클래스에 있어 무슨일을 하는지 소스를 살펴 보기 편하다
    String[] names = dir.list(new MyFileNameFilter());
    //
    // 

    for (String name : names) {
      System.out.println(name);
    }

  }
}