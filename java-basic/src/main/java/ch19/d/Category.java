// static nested class 문법을 응용하여 분류 관리
package ch19.d;

// 상수를 관리하는 용도로만 사용될 클래스 라면 서브 클래스를 만들지 못하도록 막아야한다.
// => final 제한자를 사용하라!
public final class Category {

  public final static class computer {
    
    //분류의 각 계층을 static 중첩 클래스로 선언하여 관리한다.
    // => 보통 클래스 이름은 대문자로 시작해야 한다.
    // => 그런데 ognl 표기법에서 하위 프로퍼티를 지정하는 것처럼 보이게 하려고
    //   일부러 소문자로 이름지엇다
    
    public  final static class mouse{
      public static final int bluetooth = 111;
      public static final int gaming = 112;
      public static final int wired = 113;
      public static final int trackball = 114;
    }
    public static final int keyboard = 102;
    public static final int monitor = 103;
    public static final int cpu = 104;
    public static final int ram = 105;
    public static final int vga = 106;
  }
  public final static class appliance {
    public static final int tv = 201;
    public static final int audio = 202;
    public static final int dvd = 203;
    public static final int vacuum = 204;
  }
  public final static class book{
    public static final int poet = 301;
    public static final int nevel = 302;
    public static final int essay = 303;
    public static final int it = 304;
    public static final int lang = 305; 
  }
}
