package practice.c;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 애노테이션 사용 범위
@Target(ElementType.TYPE) // 클래스나 인터페이스에 선언가능
public  @interface MyAnnotation {

}
