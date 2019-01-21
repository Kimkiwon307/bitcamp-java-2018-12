// 정렬 객체를 일관성 있게 사용하려면 같은 타입으로 묶어야 한다 - 핵씸!

package ch17.c;

import ch17.c.Sorter;

public class Test01 { 

  public static void main(String[] args) {

    int[] values = {23, 7, 12, 15, 9, 2, 22, 8, 11, 25, 13, 5};
    int[] values2 = {23, 7, 12, 15, 9, 2, 22, 8, 11, 25, 13, 5};
    int[] values3 = {23, 7, 12, 15, 9, 2, 22, 8, 11, 25, 13, 5};
    
    Sorter s1 ;
    Sorter s2 ;

    display(new BubbleSort(), values);
    display(new QuickSort(), values2);
    
    // 다음을 막을수 읎다
    // => Sorter는 단지 정렬을 수행하는 클래스를 만들 때 일관성 있게하려고
    //   수퍼 클래스로서 사용하도록 만든것이다랑깨
    display(new Sorter(), values3);
  }

  static void display(Sorter sorter, int[] values) {

    sorter.sort(values);

    for(int value : values) {
      System.out.print((value + ","));
    }
    System.out.println();
  }

  
}
