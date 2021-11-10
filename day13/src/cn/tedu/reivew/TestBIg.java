package cn.tedu.reivew;

import java.math.BigDecimal;
import java.util.Scanner;

//本类用于复写浮点数运算不精确
public class TestBIg {
    public static void main(String[] args) {
        //接受用户输入的两个数
        System.out.println("请您输入第一个小数:");
        double a=new Scanner(System.in).nextDouble();
        System.out.println("请您输入第二个小数:");
        double b=new Scanner(System.in).nextDouble();
        //创建BigDecimal来保存数据
        BigDecimal bd1 = new BigDecimal(a+"");
        BigDecimal bd2 = new BigDecimal(b+"");
        //定义一个bd3来保存运算结果
        BigDecimal bd3;
        bd3=bd1.add(bd2);
        System.out.println(bd3);
        System.out.println("加法结果："+bd1.add(bd2));
        System.out.println("减法结果："+bd1.subtract(bd2));
        System.out.println("乘法结果："+bd1.multiply(bd2));
        System.out.println("除法结果："+bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));

    }
}
