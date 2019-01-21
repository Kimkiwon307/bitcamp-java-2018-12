//추상 메서드의 효용성 - 
package ch17.e;

import ch17.e.Sorter;

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
    display(new MergeSort(), values3); 
    
  }

  static void display(Sorter sorter, int[] values) {

    sorter.sort(values);

    for(int value : values) {
      System.out.print((value + ","));
    }
    System.out.println();
  }

  
}
