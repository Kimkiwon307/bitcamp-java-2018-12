package algorithm.data_structure.array;

import java.util.Arrays;

public class ArrayList {

  static final int DEFAULT_SIZE = 5 ;
  Object[] arr;
  int size = 0;


  public ArrayList(){
    this(0);
  }
  public ArrayList(int capacity) {
    if (capacity > DEFAULT_SIZE)
      arr = new Object[capacity];
    else
      arr = new Object[DEFAULT_SIZE];
  }

  public Object[] toArray() {
    Object[] list = new Object[this.size];
    for (int  i = 0; i<this.size; i++) {
      list[i] = this.arr[i];
     
    }
   
    return list;
  } 

  public void add(Object value) {
    if (size == arr.length)
      increase();
    // 현재 배열이 꽉 찼다면 현재 배열 크기의 50% 만큼 증가시켜라.

    arr[size++] = value;
  }

  public int insert(int index, Object value) {
    if (index < 0 || index >= size)
      return -1;

    if (size == arr.length)
      increase();
    for(int i = size - 1;  i >= index; i--)
      this.arr[i+1] = this.arr[i];
    this.arr[index] =value;
    size++;

    return 0;

  }
  public Object get(int index) {
    // 유효 인덱스(현재 배열에 데이터가 저장된 방 번호)가 아니면 null을 리턴하라
    if (index < 0 || index >= size)
      return null;
    return arr[index];
  }

  public Object set(int index, Object value) {
    //    유효 인덱스(현재 배열에 데이터가 저장된 방 번호)가 아니면 변경하지 말라. 리턴값은 null이다
    if (index < 0 || index >= size)
      return null;
    Object a =  arr[index];
    arr[index] = value;
    return a;
  }

  public Object remove(int index) {
    //  유효 인덱스(현재 배열에 데이터가 저장된 방 번호)가 아니면 변경하지 말라. 리턴값은 null이다
    if (index < 0 || index >= size)
      return null;

    Object old = arr[index];

    for (int i = index; i < size -1; i++) {
      arr[i] = this.arr[i+1];
      
      size--;
    }
    return old;
  }
  public int size() {
    return this.size;
  }

  private void increase() {
    int oc = arr.length;
    int nc = oc + (oc + oc >> 1);
    arr = Arrays.copyOf(arr, nc);
  }



}
