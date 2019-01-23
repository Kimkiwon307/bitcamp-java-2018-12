package algorithm.data_structure.linkedlist;

public class linkedlist2 {
  protected Node head;
  protected Node tail;
  protected int size;

  public linkedlist2() {
    head = new Node();
    tail = head;
    size = 0;
  }

  public void add(Object value) {

    Node node = new Node();
    tail.value = value;
    tail.next = node;
    node.prev = tail;
    tail = node;
     
    size ++;

  }

  public Object get(int index) {

    if(index<0 || index>=size) {
      return null;
    }
    
    Node cs ;
    cs = head;
    for(int i = 1; i <= index ; i++) {
        cs = cs.next;
    }
    return cs.value;

    
  }

  public Object set(int index, Object value) {
    if(index<0 || index>=size) {
      return null;
    } Node cs ;
    cs = head;
    for(int i = 1; i <= index ; i++) {
        cs = cs.next;
    }
    Object old = cs.value;
     
    cs.value = value;
    
    return old;
    
  }
  public int size() {
    return size;
  }

 




}

