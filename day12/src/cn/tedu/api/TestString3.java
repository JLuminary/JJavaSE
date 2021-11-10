package cn.tedu.api;

import java.awt.*;

/*本类用于测试字符串的拼接
* 使用操作字符串的方法还是使用String的API
* 拼接字符串用StringBuffer或StringBuilder*/
public class TestString3 {
    public static void main(String[] args) {
        //需求：将26个字母拼接一万次
        String s="abcdefghijklmnopqrstuvwxyz";
//        method(s);//测试普通字符串的拼接
        method2(s);//用来测试StringBuilder/StringBuffer的字符串拼接
    }
    //使用方式拼接字符串
    private static void method2(String s) {
//        StringBuffer sb=new StringBuffer();
        StringBuilder sb2=new StringBuilder();
        //2.循环拼接10000
        Long t=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb2.append(s);//拼接字符串
        }
        Long t1=System.currentTimeMillis();
        System.out.println(sb2);
        System.out.println(t1-t);
    }

    private static void method(String s) {
        //1.创建一个变量用来保存最终拼接好的结果
        String result=" ";
        //5.添加计时功能
        //5.1获取循环开始时间
        long s1 = System.currentTimeMillis();
        //打印开始时间
        System.out.println(s1);
        //2.创建循环执行10000次
        for(int i=1;i<=10000;i++){
            //3.进行字符串的拼接
            result = result + s;
        }
        //5.2获取循环结束时间
        long end = System.currentTimeMillis();
        //打印结束时间
        System.out.println(end);
        //4.将拼接的结果打印
        System.out.println(result+ "\n");
        //5.3打印拼接花费时间
        System.out.println(end-s1);
    }
}
