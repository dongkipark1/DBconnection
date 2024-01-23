package controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) // 어노테이션이 실행시에 발동
@Target(ElementType.METHOD)
public @interface RequestMapping {
    String uri();   // uri에서 i는 identify
}
