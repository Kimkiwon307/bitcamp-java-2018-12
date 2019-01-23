// 추상 팩토리 패턴 - 팩토리 객체를 추상화 시키는 방식. 다양한 팩토리로 대체할 수 있다.
package design_pattern.abstract_factory;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {
    // 설계
    // UnitFactory 인터페이스 : 공장 객체의 사용 규칙을 정의
    // AbstractUnitFactory 추상 클래스: UnitFactory의 사용 규칙을 구현, 일부 메서드는 템플릿.


    Scanner kb = new Scanner(System.in);
    int type;
    do {
      System.out.println("종족을 선택하시오?(1.t 2.p 3.z)");
      type = kb.nextInt();
      if (type > 0 && type < 4 ) {
        break;
      }
      System.out.println("해당하는 종족이 없어요 ");
    }while(true);

    UnitFactory unitFactory = null;

    switch(type) {
      case 1:
        System.out.println("이영호에요");
        unitFactory = new TerranUnitFactory();
          kb.close();
        break;
      case 2:
        System.out.println("김택용입니다");
        unitFactory = new ProtossUnitFactory();
        kb.close();
        break;
      case 3:
        System.out.println("마주작입니다.");
        unitFactory = new ZergUnitFactory();
        kb.close();
        break;
      default:
        kb.close();
        break;
    }
      //식당 짓기
    Unit u1 = unitFactory.createUnit(UnitFactory.RESTAURANT);
    u1.build();
    
    System.out.println("-----------------------------------");
    // 훈련소 짓기
    Unit u2 = unitFactory.createUnit(UnitFactory.RESTAURANT);
    u2.build();

  

  }

}
