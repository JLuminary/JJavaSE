package cn.tedu.reivew;
//day10 接口练习
public class Test3 {
    public static void main(String[] args) {
        Pigeon p=new Pigeon();
        p.eggnumber=6;
        p.fly();
        p.layEggs();
        Swallow s=new Swallow();
        s.eggnumber=8;
        s.fly();
        s.layEggs();
        s.makehome();
        Ant a=new Ant();
        a.eggnumber=100;
        a.fly();
        a.spawn();
        Bee b=new Bee();
        b.eggnumber=200;
        b.fly();
        b.spawn();
        b.makehoney();

    }
}
interface FlyAnimal{
    void fly();
}
abstract class Bird {
    int legnumber=2;
    int eggnumber;
    public abstract void layEggs();
}
abstract class Insect{
    int legnumber=6;
    int eggnumber;
    public abstract void spawn();
}
class Pigeon extends Bird implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("小鸽子可以飞");
    }

    @Override
    public void layEggs() {
        System.out.println("小鸽子下蛋数为："+eggnumber);
    }
}
class Swallow extends Bird implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("小燕子可以飞");
    }

    @Override
    public void layEggs() {
        System.out.println("小燕子下蛋数："+eggnumber);
    }
    public void makehome(){
        System.out.println("小燕子可以用口水筑巢");
    }
}
class Ant extends Insect implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("小蚂蚁可以飞");
    }

    @Override
    public void spawn() {
        System.out.println("小蚂蚁蚕卵数："+eggnumber);
    }
}
class Bee extends Insect implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("小蜜蜂可以飞");
    }

    @Override
    public void spawn() {
        System.out.println("小蜜蜂产卵数："+eggnumber);
    }
    public void makehoney(){
        System.out.println("蜜蜂可以造蜂蜜");
    }
}
