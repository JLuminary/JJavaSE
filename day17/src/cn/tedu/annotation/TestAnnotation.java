package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*本类用于注解的入门案例：尝试自定义一个注解*/
public class TestAnnotation {
}

//2.通过@Targer注解标记自定义注解Rice可以使用的位置
/*3.通过元注解@Target规定自定义注解可以使用在哪些位置
 * 我们使用"ElmenttType.静态常量"的方式来指定自定义注解具体位置
 * 而且，值可以写多个，格式：@Target（{值1，值2，值3}）*/
@Target({ElementType.TYPE, ElementType.METHOD})
//3.通过@Ratention注解标记自定义注解Rice的生命周期
/*4.我们通过元注解@Retention规定自定义注解的生命周期
 * 我们使用“RetentionPolicy.静态常量”的方式来指定自定义注解具体的存活时间
 * 注意：这里的值只能写一个：SOURCE CLASS RUNTIME 3选1*/
@Retention(RetentionPolicy.RUNTIME)//到运行时都有效
//1.定义自定义注解--步骤
        /*1.首先注意：注解定义的语法与Java不同
         * 2.定义自定义注解的格式是：@interface 注解名{}*/
@interface Rice {
    //5.我们可以给注解进行功能增强--添加注解的属性
    /*6.注意：int age()不是方法的定义而是给自定义注解添加了一个age属性*/
    int age() default 0;//给自定义注解的普通属性赋予默认值
    /*7.注解中还可以添加特殊属性value
    * 特殊属性的定义方式与普通属性的定义方式一样，要求：有名字必须是value，类型不做限制*/
    String value() default "lemon";
}

/*注解使用时，在规定位置：@注解名即可*/
//4.定义一个类用来测试自定义注解
//@Rice
class TestAnno {
    /*测试1：分别给TestAnno类name属性 eat（）都添加了Rice注解
     * 结论：属性上的注解报错了，说明自定义注解加在什么位置，由@Target决定*/
    //@Rice
    String name;

    /*测试2：当我们给Rice注解添加了一个age属性后，@Rice注解使用时直接报错
     * 结论：当注解没有定义属性时，可以直接使用
     *      当注解定义了属性以后，必须给属性赋值*/
    /*测试3：给age属性赋予默认值以后可以直接使用@Rice注解
    * 不需要给age属性赋值，因为age属性已经有默认值0*/
    /*测试4：给Rice注解添加了特殊属性value后，也必须给属性赋值
    * 只不过特殊属性value赋值时可以简写成@Rice（”Apple“）*/
    /*测试5；如果特殊属性也赋予了默认值，那么可以直接使用这个注解
    * 但是如果想给注解的所有属性赋值，每条赋值语句都不能简写，包括特殊属性*/
    @Rice(age = 3, value = "大牛")
//    @Rice
    public void eat() {
        System.out.println("干饭不积极，思想有问题~~");
    }
}