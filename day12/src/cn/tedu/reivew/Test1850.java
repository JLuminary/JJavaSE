package cn.tedu.reivew;

import java.math.BigDecimal;
import java.util.Scanner;

//复习测试运算
public class Test1850 {
    public static void main(String[] args) {
//        f();//测试普通的四则运算 不精确
        f1();
    }

    private static void f1() {
        System.out.println("请您输入第一个需要计算的数:");
        double a=new Scanner(System.in).nextDouble();
        System.out.println("请您输入第二个需要计算的数:");
        double b=new Scanner(System.in).nextDouble();
        BigDecimal bd =new BigDecimal(a+"");
        BigDecimal bd1 =new BigDecimal(b+"");
        System.out.println(bd.add(bd1));
        System.out.println(bd.subtract(bd1));
        System.out.println(bd.multiply(bd1));
        System.out.println(bd.divide(bd1,3,BigDecimal.ROUND_HALF_UP));
    }

    private static void f() {
        System.out.println("请您输入第一个需要计算的数");
        double a=new Scanner(System.in).nextDouble();
        System.out.println("请您输入第二个需要计算的数");
        double b=new Scanner(System.in).nextDouble();
        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
