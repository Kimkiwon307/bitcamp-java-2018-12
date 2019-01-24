// 
package ch19.d;

public class Test01 {

  public static void main(String[] args) {
    Product p = new Product();
    p.maker = "비트마우스";
    p.title = "비트마우스";
    p.price = 65000;
    
    //분류를 지정할 때 OGNL 방식으로 표현할 수 있따.
    // => Object Graph Navigation Language은 객체의 하위 프로퍼티 값에 접근하는 표기법.
    // = > 문법:
    //      객체.프로퍼티명.프로퍼티명.프로퍼티명 = 값.
    // => 자바는 기본으로 객체의 필드를 사용할 "때 dot(.)을 이용하여 지정한다.
    //   그 하위 필드도 마찬가지로(점(.))을 이용하여 지정할 수 있다.
    //   이런 식으로 점을 이용하여 하위 필드를 지정하는 표기법을 OGNL이라 한다. 
   // => static nested class를 사용하여 더 극단적으로 분류값을 ognl 표기법을 사용
    
    p.category = Category.computer.mouse.bluetooth;
   
    
  }

}
