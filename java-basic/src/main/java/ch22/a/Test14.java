// java.io.File 클래스 : 과제 - bin 폴더를 삭제하라!
package ch22.a;

import java.io.File;
import java.io.FilenameFilter;


public class Test14 {
  static int c = 0;
  public static void main(String[] args) throws Exception {
    // 클래스 이름을 출력할 때 패키지 이름을 포함해야 한다.
    // 예) ch01.Test01
    // 예) ch22.a.Test14
    //
    File dir = new File("bin/main");
    
    findClass(dir, "");
    System.out.println("완료!"+ c);
  }
  
  static void findClass(File dir, String packageName) {
    ++c;
    File[] files = dir.listFiles(pathname -> 
      pathname.isDirectory() ||
      (pathname.isFile() && pathname.getName().endsWith(".class")) ?
          true : false);
    
    for (File file : files) {
      if (file.isFile()) {
        System.out.printf("%s%s\n", 
            packageName, 
            file.getName().replace(".class", ""));
      } else {
        findClass(file, packageName + file.getName() + ".");
      }
    }
  }
}
