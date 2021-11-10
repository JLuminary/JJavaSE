package cn.tedu.oop;
//本类用于测试代码块
public class TestBlock {
    public static void main(String[] args) {
        Apple a=new Apple();
        Apple a1=new Apple();
        a1.clean();
    }
}
//创建一个类
class Apple{
    /*格式：static{}
    * 位置：类里方法外
    * 执行时机：静态代码块也属于静态资源，随着类的加载而加载，优先于对象加载并且静态资源只会加载一次
    * 作用：用于加载那些第一时间都需要加载，并且只加载一次的资源，常用来初始化
    * */
    //创建构造代码块
    /*位置：；类里方法外
    * 执行时机：创建对象时执行，并且优先构造方法执行
    * 作用：用于提取所有构造方法的共性功能
    * */
    static{
        System.out.println("我是一个静态代码块");
    }
    {
        System.out.println("我是构造代码块");
    }
    //创建无参构造
    public Apple(){
        System.out.println("我是无参构造");
    }
    public void clean(){
        System.out.println("我是一个普通方法");
        /*位置：方法里
        * 执行时机：每次调用局部代码块所处的方法时才会执行
        * 作用：用于控制变量的作用范围
        * */
        {
            System.out.println("我是一个局部代码块");
        }
    }
}
