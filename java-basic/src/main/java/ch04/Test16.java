// 비트 이동 연산자III : >>, >>>, <<
package ch04;

public class Test16{
    public static void main(String[] args) {
     int a = 0xc9; // 201
     System.out.println(Integer.toHexString(a << 4));
     System.out.println(a << 4);
     
     System.out.println(Integer.toHexString(a << 3));
     System.out.println(a << 3);
     
     System.out.println(Integer.toHexString(a << 2));
     System.out.println(a << 2);
     
     System.out.println(Integer.toHexString(a << 1));
     System.out.println(a << 1); 
     
    //     0111 1111 1111 1111 1111 1111 1111 1010 = ?
   //   1000 0000 0000 0000 0000 0000 0000 0110
     
     a = -202;
     System.out.println(a << 1); //
     System.out.println(a << 2); // 
     System.out.println(a << 3); // 
     System.out.println(a << 4); // 
     System.out.println(Integer.MAX_VALUE);
     
      
    }
}
