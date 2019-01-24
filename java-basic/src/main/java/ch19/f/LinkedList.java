// 특정 클래스에 의해서만 사용되는 클래스가 있다면 그 클래스 안에 정의하라!
package ch19.f;


public class LinkedList {
  public static final int FORWARD = 0;
  public static final int REVERSE = 1;

  protected Node head;
  protected Node tail;
  protected int size = 0;

  public LinkedList() {
    head = new Node();
    tail = head;
    size = 0;
  }

  public void add(Object value) {
    tail.value = value;
    Node node = new Node();
    tail.next = node;
    node.prev = tail;
    tail = node;
    size++;
  }
  public int size() {
    return size;
  }

  public Object get(int index) {
    if (index < 0 || index >= size)
      return null;

    Node cursor = head;

    for(int i = 1; i<= index; i++ ) {
      cursor = cursor.next;
    }
    return cursor.value;
  }


  public Object [] toArray(int direction) {
     
    // 
    
    Array helper = new Array ();

    if (direction ==  FORWARD) {
      return helper.copy();
    }
    else {
      return helper.reverseCopy();
    }
  }


  public Object set(int index, Object value) {

    if(index <0 || index >= size)
      return null;
    Node cursor = head;

    // 교체할 값이 들어 있는 노드로 이동한다.
    for(int i = 1 ; i <= index; i++) {
      cursor = cursor.next;
    }

    // 변경 전에 이전 값을 보관한다.
    Object old = cursor.value;


    cursor.value = value;
    return old;
  }

  // 값을 삽입하는 경우에는 ArrayList 방식 보다 효율적이다.
  // 해당 노드를 찾은 후에 새 노드를 앞,뒤 노드에 연결하면 된다.
  // 1. 새노드 만들기 


  public int insert(int index, Object value) {
    if(index < 0 || index >= size)
      return -1;

    // 1. 새노드를 만들어 값을 만든다.
    Node node = new Node(value);

    //2. 현재 노드부터 삽입할 위치를 찾는다
    Node cursor = head;

    for(int i = 1 ; i<=index; i++) {
      cursor = cursor.next;
    }

    // 새 노드가 찾은 노드를 가리키게 한다.
    node.next = cursor;

    // 찾은 노드의 이전 노드 주소를 새 노드의 이전 노드 주소로 설정한다.
    node.prev = cursor.prev;

    // 찾은 노드의 이전 노드로 새 노드를 가리키게 한다.
    cursor.prev = node;

    if (node.prev != null) {
      // 이전 노드의 다음 노드로 새 노드를 가리키게한다.
      node.prev.next = node;
    }else {
      // 맨 앞에 노드를 추가할 때는 head를 변경 해야한다.
      head = node;
    }

    // 크기를 늘린다.
    size ++ ;

    return 0;
  }
  public Object remove(int index) {

    if(index < 0 || index >= size)
      return null;


    Node cursor = head;
    for(int i = 1; i <= index; i++) { 
      cursor = cursor.next;
    }
    if (cursor.prev != null) {
      //찾은 노드의 이전 노드가 다음 노드를 가리키게 한다.
      cursor.prev.next = cursor.next;
    } else {
      // 맨 첨 노드를 삭제할 때
      head = cursor.next;
    }


    //찾은 노드의 다음 노드가 이전 노드를 가리키게 한다.
    cursor.next.prev = cursor.prev;

    // 가비지를 효과적으로 계산할 수 있또록
    // 가비지가 된 객체는 다른 객체를 가리키지 않도록 한다.
    Object old = cursor.value;
    cursor.value = null;
    cursor.next = null;
    cursor.prev = null;

    //크기를 줄인다.

    size --;
    return old;

  }
  
  
 // 중첩 클래스는 크게 static 이냐 non - static냐로 나눌 수 있는데,
 // 바깥 클래스의 특정 인스턴스를 사용하지 않는다면 static nested class로 선언하라
 // 그러나 바깥 클래스의 특정 인스턴스를 사용한다면 그 인스턴스에 종속되기 때문에
  // non-static nested class로 선언하라
  // => 다음 arr
  private class Array {
/*
    LinkedList list;

    public Array(LinkedList list) {
      this.list = list;
    }
*/
    //입력된 순서대로 배열을 만든다.
    public Object[] copy() {

      Object[]  arr = new Object[size()];

      for(int i = 0 ; i < size(); i++) {

        arr[i] = get(i);
      }
      return arr;
    }

    // 입력된 순서의 반대로 배열을 만든다.
    public Object[] reverseCopy() {
      Object[] arr =new Object[size()];

      for(int i = size()-1, j = 0 ; i >=0; i--, j++) {
        arr[j] = get(i);

      }
      return arr;
    }


  }




}




