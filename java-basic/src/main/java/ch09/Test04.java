// 클래스 필드의 한계

package ch09;


public class Test04{
  public static void main(String[] args) {

    //calculaor1을 사용하여 두 계산식을 동시에 하기
    // 식1) 2 * 3 - 2 + 7 = ?
    // 식2) 6 / 2 + 8 = ?

    // Caculator1을 사용할 경우 계산 결과를 직접관리 .
    int result1 = 0;
    int result2 = 0;

    result1 = Calculator1.multiple(2,3);
    result2 = Calculator1.divide(6, 2);

    result1 = Calculator1.minus(result1, 2);
    result2 = Calculator1.plus(result2, 8);

    result1 = Calculator1.plus(result1, 7);

    System.out.println(result1);
    System.out.println(result2);

    // calculator1을 사용할 경우 계산 겨로가를 직접 관리해야 하기 때문에 불편하다
    //그러나 여러 게산식을 동시에 처리할 수 있는 이점이 있다.
    // calculator2를 사용할경우 계산 결과를 직접 관리하지 않아도 되기 때문에 편하다
    // 그러나 게산 결과를 클래스에서 한 개만 관리하기 때문에 여러 개산식을 동시에 실행할수없다.
    // 클래스에서 여러 결과를 따로 따로 관리하는 방법은 없을까?
    // => 인스턴스 필드를 사용하는 것이다.
    
  
  }
}
