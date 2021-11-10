package cn.tedu.api;

import java.math.BigDecimal;
import java.util.Scanner;

//本类用于解决浮点数运算不精确的问题
public class TestBigDecimal {
    public static void main(String[] args) {
//        f1();//使用普通四则运算
        f2();//

    }
    //本方法用来解决浮点数不精确的问题
    private static void f2() {
        System.out.println("请您输入两个要计算的小数：");
        double a =new Scanner(System.in).nextDouble();
        double b =new Scanner(System.in).nextDouble();

        //2.创建工具类对象
        /*1.最好不要用double类型作为构造的参数类型，不然还会又不精确的问题
        * 2.推荐使用String类会参数，double转String，直接拼个空串就可以了*/
        BigDecimal bd1 = new BigDecimal(a+"");
        BigDecimal bd2 = new BigDecimal(b+"");
        System.out.println("相加："+bd1.add(bd2));
        System.out.println("减法："+bd1.subtract(bd2));
        System.out.println("乘法："+bd1.multiply(bd2));
        /*divide在除不尽时会抛出算数异常，因为没有办法精确表示结果
        * 解决方案：需要额外设置除不尽时的保留位数和舍入方式
        * divide（a,b,c）
        * a是指要除哪个数
        * b是保留位数
        * c是舍入方式 这里是四舍五入*/
        System.out.println("除法："+bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));
        BigDecimal bd3;

    }

    private static void f1() {
        //1.提示并接收用户输入的两个小数
        System.out.println("请您输入两个要计算的小数：");
        double a =new Scanner(System.in).nextDouble();
        double b =new Scanner(System.in).nextDouble();

        //2.做运算
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
