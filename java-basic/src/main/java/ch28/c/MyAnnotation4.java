package ch28.c;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 애노테이션 유지 범위 지정하기
// 아무것도 지정하지 않으면 기본이 CLASS이다.

@Target(ElementType.LOCAL_VARIABLE)
public @interface MyAnnotation4 {

}
