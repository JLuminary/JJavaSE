package cn.tedu.oop2;

import javax.jws.soap.SOAPBinding;

//本类用于测试多态成员的使用情况
public class TestDome2 {
    public static void main(String[] args) {
//        Dog2 d=new Dog2();
//        d.eat();
//        System.out.println(d.sum);
        /*口诀1：父类引用指向子类对象
        * 口诀2：编译(保存)看左边，运行(效果)看右边*/
        Animal2 a=new Dog2();
        /*多态中：成员变量使用的是父类*/
        System.out.println(a.sum);
        /*多态中，方法的声明使用的是父类的，方法体使用的是子类的*/
        a.eat();
        /*多态中，调用的静态方法是父类的，因为多态的对象把自己看做父类类型
        * 直接使用父类对象中的静态资源*/
        Animal2.play();

    }
}
class Animal2{
    int sum=10;
    public void eat(){
        System.out.println("吃嘛嘛香");

    }
    //定义父类的静态方法
    public static void play(){
        System.out.println("玩啥都行");
    }
}
class Dog2 extends Animal2{
    int sum=20;
    public void eat(){
        System.out.println("吃狗肉最香香");
    }
//    @Override
    /*这不是重写方法，只是恰巧在两个类中出现了一模一样的两个静态方法
    * 静态方法属于类资源，只有一份 不存在重写现象
    * 在那个类型定义，就作为那个类的资源使用*/
    public static void play(){
        System.out.println("小狗喜欢玩皮球");
    }
}
class Cat2 extends Animal2{
    public void eat(){
        System.out.println("吃猫肉最香香");
    }
}