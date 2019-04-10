package com.eomcs.lms.context;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 클라이언ㅌ느가 보낸 파라미터 값을 받는 변수를 가리킬때 사용한다
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface RequestParam {
  String value();
  //default "" 안해놓으면 필수속성이다
}
