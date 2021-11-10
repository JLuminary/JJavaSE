package cn.tedu.reivew;

public class TestExtends1 {
    public static void main(String[] args) {
        Father f=new Father();
        Son s=new Son();
        s.study();
    }
}
class Father{
    int sum =1;
    int count =2;
}
class Son extends Father{
    int sum=10;
    public void study(){
        int sum=100;
        System.out.println("woshigoodstudy");
        //打印子类的局部变量
        System.out.println(sum);
        //打印子类的成员变量
        System.out.println(this.sum);
        //打印父类的成员变量count
        System.out.println(count);
        //打印父类的成员变量sum
        System.out.println(super.sum);
    }
}