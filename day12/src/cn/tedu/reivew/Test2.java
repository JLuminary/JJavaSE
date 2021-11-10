package cn.tedu.reivew;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

//本类用于测试String
public class Test2 {
    public static void main(String[] args) {
        String s1="abc";
        char[] c={'a','b','c'};
        String s2=new String(c);
        System.out.println(s1.hashCode());//96354--哈希码的值相同
        System.out.println(s2.hashCode());//96354--哈希码的值

        System.out.println(s1.equals(s2));//true

        System.out.println(s1.toUpperCase());//全大写
        System.out.println(s1.toLowerCase());//全小写

        System.out.println(s1.length());//3--字符串长度

        System.out.println(s1.charAt(1));//数组下表为1时 所对应的值

        System.out.println(s1.indexOf("a"));//0 标示的是字符a所对应的下标
        System.out.println(s1.lastIndexOf("c"));//2 标识的是字符c所对应的下标

        System.out.println(s1.concat("def"));//拼接字符串


        String s3="abdbfbgbhbbjbkbl";   //去除括号当中去除的字符
        String[] sp=s3.split("b");
        System.out.println(Arrays.toString(sp));

        String s4="   h   h  h  hhhhh    ";//去除首尾空格
        System.out.println(s4.trim());

        String s5="asdfghjkl";
        System.out.println(s5.substring(3));//下标从三开始往后输出
        System.out.println(s5.substring(3,6));//下表从[3,6）输出

        System.out.println(String.valueOf(5)+10);//把int类型的数据转换成String

        byte[] bytes=s2.getBytes();
        System.out.println(Arrays.toString(bytes));//把字符串存储到byte数组里面
    }
}
