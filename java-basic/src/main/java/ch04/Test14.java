// 비트 이동 연산자 : >>, >>>, >>>>
package ch04;

public class Test14{
    public static void main(String[] args) {
     int a = 0xca; // 202
     System.out.println(Integer.toHexString(a >> 4));
     System.out.println(a >> 4);
     
     System.out.println(Integer.toHexString(a >> 3));
     System.out.println(a >> 3);
     
     System.out.println(Integer.toHexString(a >> 2));
     System.out.println(a >> 2);
     
     System.out.println(Integer.toHexString(a >> 1));
     System.out.println(a >> 1); 
     
     
     a = -202;
     System.out.println(a >> 1); // -101
     System.out.println(a >> 2); // 2**2 = -51
     System.out.println(a >> 3); // 2**3 = -26
     System.out.println(a >> 4); // 2**4 = -13
      
    }
}
