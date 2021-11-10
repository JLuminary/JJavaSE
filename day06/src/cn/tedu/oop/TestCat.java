package cn.tedu.oop;
//本类用于面向对象巩固案例
public class TestCat {
    public static void main(String[] args) {
     Cat a =new Cat();
     //通过创建好的对象调用此功能
        a.miaoMiao();
        a.jump();
        a.name="小黑";
        a.age=564;
        a.hosts="太白";
        System.out.println(a.age);
        System.out.println(a.name);
        System.out.println(a.hosts);
        Cat c =new Cat();
        c.age=2;
        c.hosts="小明";
        c.name="可乐";
        System.out.println(c.age);
        System.out.println(c.hosts);
        System.out.println(c.name);
    }
}
class Cat{
    //2.属性
  String name;
  int age;
  String hosts;

    public void jump(){
        System.out.println("小猫跳的老高了");
    }
    public void miaoMiao(){
        System.out.println("小猫喜欢喵喵叫~~");
    }
}