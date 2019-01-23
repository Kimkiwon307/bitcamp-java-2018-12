package algorithm.data_structure.queue;

import algorithm.data_structure.linkedlist.LinkedList;
import algorithm.data_structure.linkedlist.Node;

// 기존 기능을 활용하는 가장 쉬운 방법이 상속이다.
// 
public class Queue  extends LinkedList {
  
  public void offer(Object value) {
      // 상속 받은 메서드를 사용하여 값을 추가하라.
      
    add(value);
   
    
  }

  public Object poll() {
      //    상속 받은 메서드를 사용하여 값을 꺼내라.
    
    
    return null;
  }
  
  public boolean empty() {
      
  
      return false;
  }
  
  
}
