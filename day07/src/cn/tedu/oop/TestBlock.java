package cn.tedu.oop;
//本类用于测试是代码块/
/*执行顺序：构造代码块 构造方法 普通方法 局部代码块 ，分析：
* 1.当创建对象时，会触发构造函数
* 2.创建对象时，也会触发构造代码块，并且构造代码块优先于构造方法执行
* 3.我们创建好对象后才能通过对象调用普通方法
* 4.如果普通方法里有局部代码块，才会触发对应的局部代码块*/
public class TestBlock {
    public static void main(String[] args) {
        Pig p=new Pig();
        Pig p1=new Pig("小明");
        Pig p2=new Pig("小白",89);
        System.out.println(p1.age);
        System.out.println(p2.age);
        p.eat();
//        p1.eat();
//        p2.eat();
    }
}

class Pig{
    //定义属性
    String food;
    int age;
    //创建构造代码块
    {
        /*构造代码块：{ }
        * 1.位置：类里方法外
        * 2.执行时机：每次创建对象时都会执行代码块，并且代码块优先于构造方法执行
        * 3.作用：用于提取所有方法的共性功能*/
        System.out.println("我是一个构造代码块");
        System.out.println("黑猪肉");
    }
    public Pig(){//无参构造
        System.out.println("我是Pig类的无参构造");
    }

    public Pig(String s){
        System.out.println("我是Pig的含参构造");
    }

    public Pig(String food, int age) {//全参构造
        System.out.println("我是Pig类的全参构造");
        this.food = food;
        this.age = age;
    }

    public void eat(){
        System.out.println("小猪爱吃猪肉");
        //创建本类的局部代码块
        {
            /*局部代码块：{ }
             * 1.位置：类里方法里
             * 2.执行时机：每次调用本局部代码块所处的方法时才会执行
             * 3.作用：用于控制变量的作用范围，变量的作用范围越小越好
             * */
            System.out.println("我是一个局部代码块");
            int i=100;
            System.out.println(i);
        }
    }
}