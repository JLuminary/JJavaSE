package cn.tedu.practice;
/*本类用作继承的入门案例*/
public class Practice3{
    public static void main(String[] args) {
        //5.创建3个类的对象
        Animal a = new Animal();
        Cat c = new Cat();
        MiaoMiao m = new MiaoMiao();
        //6.利用对象调用方法进行测试
        a.eat();
        c.eat();//爸爸类可以使用爷爷类的方法
        m.eat();//孙子类可以使用爷爷类的方法
        m.studyJava();
        /*3.继承还具有传递性，爷爷的功能会传给爸爸，爸爸的功能会传给孙子*/
    }
}

/*1.我们通过extends关键字建立子类与父类的继承关系，格式：子类 extends 父类*/
/*2.java只支持单继承，一个子类只能有一个父类，但是一个父类可以有多个子类*/
//1.创建爷爷类
class Animal{
    //4.添加爷爷类的方法
    public void eat(){
        //sout是生成打印语句的快捷方式
        System.out.println("小动物Animal吃啥都行~");
    }
}
//2.创建爸爸类，并与Animal类建立继承关系
/*6.继承是is a的关系，比如小猫是小动物，MiaoMiao是一只小猫
 * 继承要求子类必须是父类的一种下属类型，依赖性非常强，强耦合*/
class Cat extends Animal{
    //7.定义爸爸类中的属性--成员变量
    int a = 10;//普通属性
    private int b = 100;//私有属性
}
//3.创建孙子类,并与Cat类建立继承关系
class MiaoMiao extends Cat{
    /*4.子类可以拥有自己独有的方法，实现了功能的拓展，青出于蓝而胜于蓝*/
    //8.定义孙子类独有的方法
    public void studyJava(){
        System.out.println("正在学Java");
        /*5.子类继承了父类以后，可以使用父类的所有非私有资源
         * 注意：这个私有资源是由于子类不可见而不能使用的，不是因为没有继承
         * 因为子类在继承了父类以后，相当于把父类的功能完全复制了一份*/
        System.out.println(a);//可以使用父类的非私有资源
        //System.out.println(b);//不可以使用父类的私有资源，会报错
    }
}


