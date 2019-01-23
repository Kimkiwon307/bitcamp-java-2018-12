package ch18.e;

public class Canvas {
  
  // 캔버스가 사용할 도구를 구체적으로 지정 하는 대신에
  // 좀더 추상적인 방식으로 클래스 이름 대신 인터페이스를 사용하여
  // 특정 규칙에 따라 만든 도구를 사용하겠다고 지정한다.
  // => 이방식의 장점은 규칙에 따라 만든 도구ㅏㄱ 어떤 클래스를 상속 받는 사오간하지 안흔다.
  // => 만약 Pen이 인터페이스가 아니라 클래스라면 반드시 pen의 서브 클래스만 사용해야 한다.
  //   따라서 클래스를 사용하는 것 보다 인터페이스를 사용하는 것이 훨씬 유여한 코딩가능
  Pen tool;
  
   public Canvas(Pen tool) {
     this.tool = tool;
   }
   
   public void setPen (Pen tool) {
     this.tool = tool;
   }
   
   public void render(String contents) {
     tool.write(contents);
   }
   
   
}
