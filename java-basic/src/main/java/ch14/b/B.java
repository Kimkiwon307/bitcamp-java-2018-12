package ch14.b;

public class B extends A{

  // 오버라이딩 규칙
  // => 메서드 시그너처를 똑같이 한다.
  // => 파라미터 이름은 상관없다.
  //@Override void m1(int xx) {} OK

  //@Override void m1(int a) {}

  //@Override void m1(long a) {} 컴파일오류 : 리턴타입이 달라용

  //@Override void m1(int a, int b ,long a) {} 파라미터 갯수가 다르당 

  
//  @Override private void m1(int a) {} 접근 범위 축소는 안된다.
  
//  @Override protected void m1(int a) {} OK
    @Override public void m1(int a) {}   //OK

//  @Override void m2(String a, int b) {} // 축소 x
  
    @Override public void m2(String a, int b) {} // 된다


}
