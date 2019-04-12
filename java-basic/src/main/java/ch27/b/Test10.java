// reflection API - 배열 항목의 타입 알아내기
package ch27.b;

import java.sql.Date;

public class Test10 {

	public static void main(String[] args) throws Exception{
	    
	  // 배열 타입이 아닌 경우 항목이 없기 떄문에 getComponentType()의 리턴값은 null이다
	  System.out.println(byte.class.getClass().getComponentType());
	  
	  
	    System.out.println(byte.class.getName());
	    System.out.println(new byte [] {}.getClass().getName());
	    System.out.println(new byte [] {}.getClass().getComponentType());
	    
	    System.out.println(short.class.getName());
	    System.out.println(new short [] {}.getClass().getName());
	    System.out.println(new short [] {}.getClass().getComponentType());
	    
	    
	    System.out.println(int.class.getName());
	    System.out.println(new int [] {}.getClass().getName());
	    System.out.println(new int [] {}.getClass().getComponentType());
	    
	    
	    System.out.println(long.class.getName());
	    System.out.println(new long [] {}.getClass().getName());
	    System.out.println(new long [] {}.getClass().getComponentType());
	    
	    
	    System.out.println(float.class.getName());
	    System.out.println(new float [] {}.getClass().getName());
	    System.out.println(new float [] {}.getClass().getComponentType());
	    
	    
	    System.out.println(double.class.getName());
	    System.out.println(new double [] {}.getClass().getName());
	    System.out.println(new double [] {}.getClass().getComponentType());
	    
	    System.out.println(boolean.class.getName());
	    System.out.println(new boolean [] {}.getClass().getName());
	    System.out.println(new boolean [] {}.getClass().getComponentType());
	    
	    System.out.println(char.class.getName());
	    System.out.println(new char [] {}.getClass().getName());
	    System.out.println(new char [] {}.getClass().getComponentType());	    
	    
	    System.out.println(String.class.getName());
	    System.out.println(new String [] {}.getClass().getName());
	    System.out.println(new String [] {}.getClass().getComponentType());	    
	    
	    System.out.println(Date.class.getName());
	    System.out.println(new Date [] {}.getClass().getName());
	    System.out.println(new Date [] {}.getClass().getComponentType());
	}
	

}
