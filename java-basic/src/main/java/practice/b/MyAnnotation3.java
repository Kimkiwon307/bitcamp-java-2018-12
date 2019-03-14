package practice.b;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public  @interface MyAnnotation3 {
	String value() default "쉬발";
}
