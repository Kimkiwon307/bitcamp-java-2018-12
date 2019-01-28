//Hashtable
package ch20.d;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Test08 {

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

    Hashtable<String, Student> map = new Hashtable<>();
    map.put("aaa", new Student("홍길동", 20));
    map.put("bbb", new Student("임꺽정", 21));
    map.put("ccc", new Student("안중근", 22));


    Set<String> keySet = map.keySet();

    // Set에서 값을 거내기 위해 Iterator의 도움을 받는다.
    Iterator<String> iterator = keySet.iterator();


    System.out.println(iterator.next());

    map.put("bba", new Student("bba",20));
    map.put("bbc", new Student("bba",20));

    //  Iterator를 사용하는 중에 Set의 값을 변경하면
    //   더이상 Iterator는 유효하지 않게 된다.
    //   따라서 다음과 같이 Iterator를 사용하려 하면 실행 오류가 발생하낟.
    //   해결책?
    // => 값을 변경하면 다시 Iterator을 얻어야 된다.

    System.out.println(iterator.next());
    System.out.println(iterator.next());

    //키 목록에서 값을  모두 꺼낸 다음에 또 꺼내려 한다면 실행 오류 발생!
    //    System.out.println(iterator.next());

  }

}
/*
 * HashMap과 Hashtable의 비교
 * 항목          HashMap                    Hashtable
 * ----------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * */
