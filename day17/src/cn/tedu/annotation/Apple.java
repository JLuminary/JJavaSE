package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//2.定义自定义注解的可以位置和生命周期
@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
//1.定义自定义注解
public @interface Apple {
    //3.定义自定义注解的属性
    double s() default 0.0;
    String value() default "";

}
