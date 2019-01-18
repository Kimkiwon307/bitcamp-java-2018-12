// 상속 : generalization (일반화)
package ch13.j;

//여러 클래스에 공통으로 들어 가는 기능나 필드가 있다면
//유지보수가 쉽도록 별도의 클래스로 추출한다.
//=> Convertible 과 DumpTruck 사아ㅣ에 공통 필드의 메서드가 있다.
//  공통 기능을 추출하여 별도의 클래스를 정의하는 것을 "일반화(generalization)"라 한다.
public class DumpTruck extends Car{
 
  int weight;
  
  public void dump() {
    System.out.println("짐을 내린다.");
  }
}
