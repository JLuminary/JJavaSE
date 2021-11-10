package cn.tedu.reivew;

import java.util.Arrays;

/*本类用于复习String的常用API*/
public class TestString2 {
    public static void main(String[] args) {
        String s1="abc" ;

        System.out.println(s1.length());//3--获取字符长度

        System.out.println(s1.toUpperCase());//ABC--字符全大写
        System.out.println(s1.toLowerCase());//abc--字符全小写

        System.out.println(s1.startsWith("c"));//false--以某个字符开头
        System.out.println(s1.endsWith("c"));//true--以某个字符结尾
//
//      System.out.println(s1.charAt(4));//报错- 数组越界了
        System.out.println(s1.charAt(0));//a--获取字符下标为0的字符

        String s2="abcdfjgksbicb";
        System.out.println(s2.length());//13--字符个数
        System.out.println(s2.indexOf("b"));//1--第一次出现字符时下标值
        System.out.println(s2.lastIndexOf("b"));//12--最后一次出现字符的下标值

        System.out.println(s1.concat("aaaa"));//abcaaaa--拼接字符串 但是不改变原串
        System.out.println(s1);//原串还是abc
//        String s3=s1.concat("aaaaa");
//        System.out.println(s3);

        String s3="   ddd  dd   d d    ";
        System.out.println(s3.trim());//去除首尾的空格

        String s4="abcdefgh";
        System.out.println(s4.substring(2));//cdefgh --截取子串
        System.out.println(s4.substring(2,6));//cdef 含头不含尾

        System.out.println(String.valueOf(10)+10);//1010 将int类型的10转变为String10
        System.out.println("10"+10);//1010
        System.out.println(10+10);//20

        byte[] bs = s1.getBytes();//将字符串转为byte[]
        System.out.println(Arrays.toString(bs));//[97, 98, 99]

        String s5="a b c d e";
        String[] s=s5.split(" ");
        System.out.println(Arrays.toString(s));//[a, b, c, d, e]

    }
}
