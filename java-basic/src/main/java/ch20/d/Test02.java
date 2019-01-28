//Map 클래스 사용법 - put(), get()
package ch20.d;

import java.util.HashMap;
import java.util.Hashtable;

public class Test02 {

  public static void main(String[] args) {
    class Student {
      String name;
      int age;

      public Student(String name, int age) {
        this.name = name;
        this.age =  age;

      }

      @Override
      public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
      }
    }

    HashMap<String, Student> map = new HashMap<>();
    Hashtable<String,Student> table = new Hashtable<>();

    //HashMap과 Hashtable은 기본 사용법이같다.
    map.put("aaa", new Student("홍길동", 20));
    table.put("aaa", new Student("홍길동",20));

    System.out.println(map.get("aaa"));
    System.out.println(table.get("aaa"));

    System.out.println("```````````````````````````````");

    map.put(null, new Student("임꺽정",30));
    System.out.println(map.get(null));


    // Hashtable은 key로 null을 사용 핤수 없다 - 런타임 오류!!
    //    table.put(null, new Student("임꺽정",30));
    //  System.out.println(map.get(null));

    System.out.println("```````````````````````````````");

    map.put("ccc", null);
    System.out.println(map.get("ccc"));

   //    table.put("ccc", null);
   //  System.out.println(map.get("ccc"));





  }

}
