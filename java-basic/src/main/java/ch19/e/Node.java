package ch19.e;

// LinkdeLIst 에서 다룰 데이터를 담는 그릇이다.
public class Node {

  public Object value;
  public Node prev; //이전거
  public Node next; // 다음거

  public Node() {
  }
 
  public Node(Object value) {
    this.value = value;
  }
 
  public Node(Object value, Node prev, Node next) {
    this(value);
    this.prev = prev;
    this.next = next;
  }






}