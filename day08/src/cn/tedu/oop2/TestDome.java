package cn.tedu.oop2;
/*本类用作于多态的入门案例*/
public class TestDome {
    public static void main(String[] args) {
        //创建"纯纯对象"
        Animal a=new Animal();
        Cat c=new Cat();
        Dog d=new Dog();
        a.eat();
        c.eat();
        d.eat();
        /*父类对象不可以使用子类的特有功能*/
//      a.run();
        c.jump();;
        d.run();;
        /*3.口诀：父类引用指子类对象
        * 解释:创建出来的子类对象的地址值，交给父类类型的引用类型变量来保存*/
        Animal a2=new Cat();//Cat类对象的地址值交给父类型变量a2来保存
        Animal a3=new Dog();//Dog类对象的地址值交给父类型变量a3来保存
        a2.eat();
        //8.测试多态对象
        /*4.口诀2.编译看左边，运行看右边
        * 必须要在父类定义这个方法才能通过编译，编译时把多态对象看作是父类类型
        * 必须要在子类重写这个方法，才能满足多态，实际干活的是子类*/

    }
}
/*1.多态的前提：继承 + 重写*/
class Animal{
    public void eat(){
        System.out.println("小动物吃啥都行");
    }
}
class Cat extends Animal{
    //4.1添加重写的方法
    public void eat(){
        System.out.println("小猫吃猫肉");
    }
    public void jump(){
        System.out.println("小猫跳的老高了~");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("小狗吃狗肉");
    }
    public void run(){
        System.out.println("小狗跳的老快了~");
    }
}