package cn.tedu.reivew;

import java.math.BigDecimal;
import java.util.Scanner;

//求加减乘除
public class Test845 {
    public static void main(String[] args) {
//        f1();//普通的//不精确
        f2();

    }

    private static void f2() {
        System.out.println("请您输入第一个小数：");
        double a=new Scanner(System.in).nextDouble();
        System.out.println("请您输入第二个小数：");
        double b=new Scanner(System.in).nextDouble();
        BigDecimal bd1 = new BigDecimal(a+"");//变成String类型 加空串
        BigDecimal bd2 = new BigDecimal(b+"");
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));
    }

    private static void f1() {
        System.out.println("请您输入第一个小数：");
        double a=new Scanner(System.in).nextDouble();
        System.out.println("请您输入第二个小数：");
        double b=new Scanner(System.in).nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
