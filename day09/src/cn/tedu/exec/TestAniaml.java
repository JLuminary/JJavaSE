package cn.tedu.exec;
/*本类用于oop的练习*/
public class TestAniaml {
    public static void main(String[] args) {
        Ant a=new Ant();
        Bee b=new Bee();
        a.fly();
        a.layEggs();
        b.makeHoney();
        b.layEggs();
    }
}
//1.抽象形成一个类
abstract class Animal{
    //2.创建属性
    int legNumbers;//腿的数量
    int eggNumbers;//下蛋的数量
    //3.创建方法
    public abstract void layEggs();

}
//创建子类蚂蚁类
class Ant extends Animal{
    int eggNumbers=2;//蚂蚁一次产2个卵
    public void fly(){
        System.out.println("蚂蚁飞了飞了 ~飞得更高");
    }
    @Override
    public void layEggs(){
        System.out.println("下蛋蚂蚁蚂蚁下蛋，蚂蚁中的战斗机，下蛋数"+eggNumbers);
    }
}

//创建子类蜜蜂类
class Bee extends Animal{
    int eggNumbers=10;//蚂蚁一次产10个卵
    public void makeHoney(){
        System.out.println("蜜蜂在产蜜");
    }
    @Override
    public void layEggs(){
        System.out.println("下蛋蜜蜂蜜蜂下蛋，蜜蜂中的战斗机，下蛋数"+eggNumbers);
    }
}