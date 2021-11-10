package cn.tedu.oop;
//本类用于测试方法的返回值
public class MethodDome {
    public static void main(String[] args) {
        method(3,6);
        int a = method(3,5);
        System.out.println("两数之和为："+a);
        System.out.println(method(9,65));
        System.out.println(method());
        method1();
    }
    private static int method(int i,int j) {
        System.out.println("猜猜我是谁");
        return i+j;
    }
    public static String method(){
//        System.out.println("小白");
        return "你好";
    }
    public static void method1(){
        System.out.println("大白吃小白");
    }
}