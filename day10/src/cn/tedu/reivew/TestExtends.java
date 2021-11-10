package cn.tedu.reivew;
//本类用于复习继承
public class TestExtends {
}
//创建一个父类
class A{
    public static void play(){
        System.out.println("父类的静态方法");
    }
    public A(){

    }
}
//创建一个子类
class B extends A{
    //public A(){}//构造函数不可以被继承，会报错
    /*静态资源属于类资源，在哪个类里定义，就作为哪个类的静态资源使用，不存在重写的现象
    *这里只是恰好父子类中出现了两个一摸一样的方法*/
    //@Override//不可以加此注释，说明方法不是重写，会报错
    public static void play(){
        System.out.println("我是子类的静态方法");
    }
}
