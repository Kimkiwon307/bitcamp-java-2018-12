// 파일 필터 클래스를 로컬 클래스로 만든다.
package ch19.g;

import java.io.File;
import java.io.FilenameFilter;

public class Test05 {
  public static void main(String[] args) {
    File dir = new File("./"); // 이클립스에서 실행하면 ./는 프로젝트 디렉토리를 가리킨다.

    FilenameFilter filter = new FilenameFilter(){
      @Override
      public boolean accept(File dir, String name) {
        if(name.endsWith(".txt"))
          return true;
        else
          return false;
      }
    };
    String[] names = dir.list(filter);
    for (String name : names) {
      System.out.println(name);
    }

  }
}
