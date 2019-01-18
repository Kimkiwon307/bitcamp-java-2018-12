// Object클래스 - equlas()
package ch15;

class My4 /*extends Object*/{
  String name ;
  int age;
 
}
public  class Test04 {
  public static void main(String[] args) {

    My4 obj = new My4();
     obj.name = "홍길동";
     obj.age = 20;
 

     My4 obj2 = new My4();
      obj.name = "홍길동";
      obj.age = 20;
 System.out.println(obj == obj2);
 
   System.out.println(obj.equals(obj2));
  
  }
}


