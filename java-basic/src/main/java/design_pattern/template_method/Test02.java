// 템플릿 메서드 패턴 - 수퍼 클래스에서  시본 실행 흐름을 정의하고 서브 클래스에서 세부 항목을 구현한다.
package design_pattern.template_method;

public class Test02 {
  //로우커플링을 낮추는게 유지보수에 좋다

  public static void main(String[] args) {
    // 유닛 객체를 직접 생성하지 않고 공장 객체를 통해 생성한다.
    
    UnitFactory unitFactory = new UnitFactory();
    
    //다형적 방법에 입각하여 됨
    Unit u1 = unitFactory.createUnit(UnitFactory.RESTAURANT);
    u1.build();
    
    System.out.println("-----------------------------------");
    // 훈련소 짖기
    Unit u2 = unitFactory.createUnit(UnitFactory.RESTAURANT);
    u2.build();
        
  }

}
