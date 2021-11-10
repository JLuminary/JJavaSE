package cn.tedu.reivew;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*本类用于复写注解案例*/
public class TestAnnotation {
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//1.定义一个自定义注解
@interface Apple {
    //3.1给自定义注解添加普通属性
    int sum() default 0;
    //3.2给自定义注解添加特殊属性
    String value() default "lomon";
}

//4.创建类测试注解
@Apple
class TestAnno{
    String name;
    @Apple
    public void eat(){
        System.out.println("吃啥都行");
    }
}