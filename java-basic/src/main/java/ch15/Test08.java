// hash code 응용 II
package ch15;
import java.util.HashMap;

public  class Test08 {
  public static void main(String[] args) {
    //    hash 코드는 map에서 값을 저장하기 위해 key로 사용한다.
    HashMap map = new HashMap();

    // Map은 값을 저장할 때 key를 이용한다.
    // => key : 값을 저장할 위치를 계산할 때 사용한다.
    // => map.put(key,value);

    // put(Object key, Object value)
    // => key 값으로 int를 넘겨준다? 내부적으로 auto-boxing을 수행하여 Integer 객체를 만든다.
    //      그리고 그 객체를 넘겨주는 것이다.
    // => put()메서드는 key로 넘겨받은 객체에 대해 hashCode()를 호출하여
    // 정수 값을 얻는다.
    // => hash Code를 사용하여 값을 저장할 위치를 꼐산한다.
    // => 그런 후 그 위치에 해당하는 배열엘 저장한다.
    
    Integer k1 = new Integer(101);
    Integer k2 = new Integer(102);
    Integer k3 = new Integer(103);
    Integer k4 = new Integer(104);
    Integer k5 = new Integer(105);

    map.put(k1,new Student("홍길동", 20, false));
    map.put(k2,new Student("임꺽정", 30, true));
    map.put(k3, new Student("유관순",17,true));
    map.put(k4, new Student("안중근",14,true));
    map.put(k5, new Student("유관",17,true));
    
    //key를 사용하여 값을 꺼내보자
    Integer k6 = new Integer(102);
    
    System.out.println(k2 == k6); //인스턴스는 다르지만, 
    System.out.println(k2.hashCode()); //hash code는 같다.
    System.out.println(k6.hashCode());
    System.out.println(k2.equals(k6)); // equals()의 비교결과도 같다
    // 결론
    // => k2 와 k6는 다른 객체지만, 내용물은 같다.
    // 따라서 k2로 저장한 값을 k6로 꺼낼 수 있따.
    // 왱? 객체는 다르지만 내부 값이 같기 때문에 같은 key라고 간주한다.
    System.out.println(map.get(k6));
    
    // 해당 키로 저장한 값을 찾을 수 없으면 null로 리턴한다.
     Integer k7 = new Integer(200);
     System.out.println(map.get(k7));
  }

  @Override
  public String toString() {
    return "Test08 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
        + super.toString() + "]";


  }

}


