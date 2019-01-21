package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class ArrayList<E>{
  static final int LENGTH = 10;

  Object[] list ;
  int Idx = 0;

  ArrayList(int a){
    if (a > LENGTH)
      list = new Object[a];
    else
      list = new Object[LENGTH];
  }
  ArrayList(){
    list = new Object[LENGTH];

  }
  public void add(Object b) {

    if(Idx >= list.length) {
      int oc = list.length;
      int nc = oc + (oc >> 1);
      list = Arrays.copyOf(list, nc);
    }
    list[Idx++] = b; 
  }


  public Object[] toArray() {
    return Arrays.copyOf(list, Idx);

  }


}
