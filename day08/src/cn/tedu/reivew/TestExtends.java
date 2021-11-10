package cn.tedu.reivew;
//本类用于练习继承
public class TestExtends {
    public static void main(String[] args) {
        Animal a=new Animal();
        Cat c= new Cat();
        MM m= new MM();
        a.eat();
        c.eat();
        m.eat();
        m.play();
    }
}

//1.创建一个爷爷类Animal
class Animal{
    public void eat(){
        System.out.println("小动物喜欢吃黑猪肉");
    }

}
//2.创建一个爸爸类Cat
class Cat extends Animal{
    //6.创建爸爸类中的成员变量
    int a=10;
    private int b=100;
    public void eat(){
        System.out.println("我想吃鱼肉");
    }
}
//3.创建一个孙子1类
class MM extends Cat{
    public void play(){
        System.out.println(a);
//        System.out.println(b);//由于父类有限制访问，所以子类不能使用父类的私有资源
    }
}
//创建孙子类2dingdang
class dingdang extends Cat{

}