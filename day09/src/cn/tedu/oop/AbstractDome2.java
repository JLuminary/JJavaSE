package cn.tedu.oop;
//本类用作抽象类构造函数测试
/*1.抽象类是否有构造方法？有
* 既然抽象了不能实例化，为什么要有构造方法
* 不是为了自己使用，而是为了子类创建对象使用，即super();*/
public class AbstractDome2 {
    public static void main(String[] args) {
        //抽象类不可以创建对象
//        Animal2 a=new Pig2();
        Pig2 p=new Pig2();

    }
}
//创建父类
abstract class Animal2{
    //创建父类的无参构造
    public  Animal2(){
        System.out.println("我是父类的无参构造，你造吗");
    }
}
//创建子类
class Pig2 extends Animal2{
    public  Pig2(){
        System.out.println("我是子类的无参构造，你真造啊啊啊啊啊啊");
    }
}