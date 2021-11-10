package cn.tedu.oop;
//本类用于抽象类中的成员测试
public class AbstractDome3 {
}
//创建抽象父类
abstract class Animal3{
    /*抽象类中可以定义成员变量*/
    int sum=100;
    int count=10;
    /*抽象类可以定义成员变量*/
    final String ANIMAL_NAME="小黄";
    /*4.抽象类中能否定义全是普通方法---可以
    * 如果抽象类中都是普通方法，为啥还要把这个类声明成抽象类呢？
    * 因为抽象类不可以被实例化，所以如果不想让外界创建本类的对象，可以把普通类声明成抽象类*/
    public  void eat(){
        System.out.println("普通方法1");
    }
    public  void eat1(){
        System.out.println("普通方法2");

    }
    /*如果一个类中含有抽象方法，这个类必须声明成抽象类*/
    public abstract void play();
    public abstract void play1();


}
//创建子类
/*如果一个子类继承了抽象父类，有两种可能
* 方案一：继续抽象，也就是作为抽象子类，不实现/实现部分抽象父类中的抽象方法
* 方案二：不再抽象，也就是作为普通子类，实现继承自父类所有抽象方法*/
class Pig3 extends Animal3{

    @Override
    public void play() {

    }

    @Override
    public void play1() {

    }
}
