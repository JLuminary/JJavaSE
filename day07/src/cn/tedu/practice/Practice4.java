package cn.tedu.practice;

public class Practice4 {
/*测试继承中变量的使用*/
    public static void main(String[] args) {
        new Son1().study();
        Father1 f = new Father1();
    }
}

//1.创建父类
class Father1{
    //3.创建父类的成员变量
    int sum = 1;
    int count = 2;
    public Father1(){
        System.out.println("woshiwucan");
    }
}
//2.创建子类
class Son1 extends Father1{
    //4.创建子类的成员变量
    int sum = 10;
    public Son1(){
        super();
    }
    //5.创建子类的普通方法
    public void study(){
        //6.创建子类的局部变量
        int sum = 100;
        System.out.println("好好学习 天天向上");
        //7.打印子类的局部变量sum
        System.out.println(sum);//100
        //8.打印子类的成员变量sum
        System.out.println(this.sum);//10
        //9.打印父类的成员变量count
        System.out.println(count);//2
        //10.打印父类的成员变量sum
        /*当父类与子类的成员变量同名的时候，可以使用super指定父类的成员变量
         * 我们可以把super看做是父类的对象：Father super = new Father();*/
        System.out.println(super.sum);//1
    }
}
