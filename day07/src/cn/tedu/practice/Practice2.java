package cn.tedu.practice;

public class Practice2 {
    public static void main(String[] args) {
        Father f=new Father();
        Son s=new Son();
        f.count();
        s.count();
    }
}
class Father{
    public void count(){
        System.out.println("我是父类");
        int sum=10;

    }
}
class Son extends Father{
    public void count1(){
        System.out.println("我是子类");
        int sum =100;
    }
}