package ch18.b;

public  class Tool2 implements SpecA {

    // public 접근 범위보다 좁은 메서드를 구현할수 없다.
    @Override
  //  private void m1() {}; //컴파일에러
  //  protected void m1() {}//컴
  //  void m1() {} 컴오 디펄트
    public void m1() {} 
    
    //모든 추상 메서드를 구현해야 한다. 한 개라도 빠뜨리면 concrete클래스로 만들수 없다
    // = > 추상
    public void m2() {}
    
    
    
}
