package cn.tedu.oop2;
//本类测试继承中变量的使用
public class ExendsDome1 {
    public static void main(String[] args) {
        new Son().study();
    }
}
//1.创建父类father类
class Father{
    //3.创建父类的成员变量
    int sum = 1;
    int count = 2;
}
//2.创建子类
class Son extends Father{
    //4.创建子类的成员变量
    int sum = 10;
    //5.创建子类的普通方法
    public void study(){
        System.out.println("good good study,day day up");
        //6.创建子类的局部变量
        int sum =100;
        //测试打印子类的局部变量-sum
        System.out.println(sum);
        //测试打印子类的成部变量-sum
        System.out.println(this.sum);
        //打印父类的成员变量
        /*当父类的成员变量和子类的成员变量同名时，可以使用super指定父类的成员变量
        * 我们可以把super看作是父类的对象：Father super = new Father();*/
        System.out.println(super.sum);
        System.out.println(count);
    }
}
