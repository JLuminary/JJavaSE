package cn.tedu.reivew;
/*本类用于测试String*/
public class TestString {
    public static void main(String[] args) {

    //1.1创建String对象方式--存在堆中
    char[] c={'a','b','c'};
    String s1=new String(c);
    String s11=new String(c);
    //1.2创建一个String对象方式2--存在常量池中
    String s2="abc";
    String s22="abc";
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s11);//flase
        System.out.println(s2 == s22);//true
        //String 重写继承自Object的三个方法，全体围绕字符串的具体内容
        String s3="aaaa";
        System.out.println(s1);//abc
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
        System.out.println(s3.hashCode());//2986048
        System.out.println(s1.equals(s2));//true

    }
}
