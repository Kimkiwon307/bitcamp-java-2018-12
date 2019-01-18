// Object클래스 -해쉬코
package ch15;

class My6 /*extends Object*/{
  String name ;
  int age;
 
 
}
public  class Test06 {
  public static void main(String[] args) {

    My6 obj = new My6();
    obj.name = "홍길동";
    obj.age = 20;


    My6 obj2 = new My6();
    obj2.name = "홍길동";
    obj2.age = 20;

     // object에서 상속 받은 hashcode()는 인스턴스마다 고유의 4바이트 정수 값을 리턴한다.
     // =>이 값은 toString()의 출력 값으로 사용된다.
    System.out.println(Integer.toHexString(obj.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));

    System.out.println(obj);
    System.out.println(obj2);
    
    // hash value?
    // - 데이터를 다른 데이터와 구분하기 위해 사용하는 특별한 정수 값이다.
    // - 특정 수학 공식에 따라 값을 계산한다.
    // = 데이터가 같은지 비교할 때 사용한다.
    // - 즉 모든 데이터를 일일이 비교하는 대신에 미리 생성된 정수 값을 비교함으로써
    // 빠르게 두 값이 같은지 알아낼 수 있따.
    // 매우 낮은 확률이지만  데이터가 다르더라도 같은 정수 값이 나올 수 있다.
  }
}


