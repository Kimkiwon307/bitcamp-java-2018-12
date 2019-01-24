// Object클래스 -hashCode() 오버라이딩
package ch15;
// Map에 값을 저장하는 key로 사용할 때 hashCode()를 오버라이딩 하라!
// 보통 값이 같은지 비교할 때 equals()와 함께 사용된다.
// 그래서 hashCode()를 오버라이딩할 때 eqauls()도 함께 오버라이딩 한다

class My7 /*extends Object*/{
  String name ;
  int age;
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    My7 other = (My7) obj;
    if (age != other.age)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
}
public  class Test07 {
  public static void main(String[] args) {

    My7 obj = new My7();
    obj.name = "홍길동";
    obj.age = 20;


    My7 obj2 = new My7();
    obj2.name = "홍길동";
    obj2.age = 20;
    
    System.out.println(obj == obj2);
    System.out.println(Integer.toHexString(obj.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));

    System.out.println(obj);
    System.out.println(obj2);
    
  }
}

