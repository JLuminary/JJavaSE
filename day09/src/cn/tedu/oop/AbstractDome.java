package cn.tedu.oop;
//本类用于抽象类的入门案例
public class AbstractDome {
    public static void main(String[] args) {
        /*4.抽象类不可以实例化！！！！创建对象*/
        //创建多态对象进行测试
        Animal a=new Pig();
        a.eat();
        a.play();
        a.fly();
    }
}
//1.创建父类
/*2.被abatract关键字修饰的类是抽象类
* 如果一个类中包含了抽象方法，那么这个类必须被声明成一个抽象类*/
abstract class Animal{
    //3.创建普通方法
    public void eat(){
        System.out.println("吃啥都行");
    }
    /*1.被abstract修饰的方法是抽象方法，抽象方法没有方法体*/
    public  abstract void play();
    public  abstract  void fly();

}
//2.创建子类
/*3.当一个子类继承抽象父类以后有两种解决方案
* 方案一：变成抽象子类，"躺平，我也不实现，继续抽象"
* 方案二：变成普通子类，实现父类中所有未实现的抽象方法：”赌债子偿“*/
class Pig extends Animal{
    @Override
    public void play(){
        System.out.println("我是森林之王，森林佳丽3000，玩不过来");
    }

    @Override
    public void fly() {
        System.out.println("飞在三万米的高空鷗也也");
    }

}
