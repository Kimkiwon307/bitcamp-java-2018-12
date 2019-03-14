package practice.b;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//애노테이션 유지범위 지정

@Retention(RetentionPolicy.CLASS)
public  @interface MyAnnotation {

}
