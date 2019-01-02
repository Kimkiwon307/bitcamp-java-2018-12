// 주석


package ch01; 

public class Test03{
    /** 이 메서드는 object 클래스와 메서드를 재정의한 것이다. */
    @Override // 에노테이션이라 부르는 주석 , 프로그램에서 사용된다
    public String toString(){
        return "ok";
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
/* 
 $ javadoc - d [문서를저장할폴더] -sourcepath[소스폴더] 패키지명
 $ javadoc -d doc -sourcepath src/main/java ch01

 */