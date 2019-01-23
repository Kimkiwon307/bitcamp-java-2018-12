package algorithm.data_structure.array;

public class ArrayList2 {
  static final int DEFAULT_SIZE = 5 ;
  Object[] arr;
  int size = 0;

  public ArrayList2(){
    this (0);

  }
  public ArrayList2(int capacity) {
    if (capacity > DEFAULT_SIZE)
      arr = new Object[capacity];
    else
      arr = new Object[DEFAULT_SIZE];
  }

  public void add(Object value) {
    if(arr.length == size) {
      int oc = arr.length;
      int nc = oc + (oc + oc >> 1);
      Object [ ]temp = new Object[nc];
      for(int i =0 ; i <= arr.length; i++) {
            temp[i] = arr[i];
        }
      arr = temp;
      
      arr[size++] = value;
    }
  }

  public int insert(int index, Object value) {
    if()
    
    
    
    
  } 

  // 현재 배열이 꽉 찼다면 현재 배열 크기의 50% 만큼 증가시켜라.

}

