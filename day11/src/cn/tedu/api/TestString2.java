package cn.tedu.api;

import java.util.Arrays;
import java.util.Locale;

//本类用于测试String类的常用方法
public class TestString2 {
    public static void main(String[] args) {
        //创建字符串方式1--堆中常量池
        String s1="abc";
        //创建字符串方式2--堆中，new一次，创建一个对象
        char[] c={'a','b','c'};
        String s2= new String(c);
        //打印查看
        System.out.println(s1);
        System.out.println(s2);

        //2.测试常用方法
        /*String也重写了hashCode(),根据字符串的具体内容生成的哈希码值
        * 所以居然s1与s2的地址值不同，此时生成 的哈希码值一致*/
        System.out.println(s1.hashCode());//96354--串内容：abc
        System.out.println(s2.hashCode());//96354--串内容：abc

        System.out.println(s1.equals(s2));//true,比较的是字符串内容

        System.out.println(s1);//abc

        System.out.println(s1.length());//3--查看当前字符串的长度
        System.out.println(s1.toUpperCase());//ABC--将本字符串变为全大写
        System.out.println(s1.toLowerCase());//abc--将本字符串变为全小写
        System.out.println(s1.startsWith("a"));//true--判断当前s1是否以a开头
        System.out.println(s1.endsWith("c"));//flase--判断当前s1是否以c结尾

        System.out.println(s1.charAt(0));//a--根据下标获取字符串指定位置的字符

        String s3="abcdbcbdacb";
        System.out.println(s3.indexOf("b"));//1--获取指定字符第一次出现的下标
        System.out.println(s3.lastIndexOf("b"));//10--获取指定字符最后一次出现的下标

        System.out.println(s2.concat("cxy"));//abccxy--拼接字符串
        System.out.println(s2);//abc:注意不会改变原字符串s2

        String s4=s2.concat("aaa");//abcaaa

        String s5="    h    h hhh hhh    ";
        System.out.println(s5.trim());//h    h hhh hhh--用于去除字符串首尾两端的空格

        String s6="abcdefgh";
        System.out.println(s6.substring(3));//defgh--从制定下标截取子串[3,结束]
        System.out.println(s6.substring(3,6));//def--从指定下标截取子串[3,6),含头不含尾

        String s7="afbfcfdfef";
        String[] fs = s7.split("f");//以指定的字符f分割字符串s7
        System.out.println(Arrays.toString(fs));//要用数组工具类打印数组具体元素，否则只会打印对象地址值[a, b, c, d, e]--分割字符串

        System.out.println(String.valueOf(10));//10
        System.out.println(20+10);//30
        System.out.println("20"+10);//2010
        System.out.println(String.valueOf(10)+10);//1010,将int类型额参数10转为String类型的参数10

        byte[] bytes = s2.getBytes();//将字符串转为byte的数组
        System.out.println(Arrays.toString(bytes));//[97, 98, 99]


    }
}
