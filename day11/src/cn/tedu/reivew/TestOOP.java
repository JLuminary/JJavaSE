package cn.tedu.reivew;
//本类用于测试面向对象的终极案例
public class TestOOP {
    public static void main(String[] args) {
        Pigeon p=new Pigeon();
        System.out.println("小鸽子腿的数量为"+ p.legnumber);
        p.eggnumber=6;
        p.fly();
        p.layEggs();
        Swallow s=new Swallow();
        System.out.println("小燕子腿的数量为"+ s.legnumber);
        s.eggnumber=8;
        s.fly();
        s.layEggs();
        s.makehome();
        Ant a=new Ant();
        System.out.println("小蚂蚁腿的数量为"+ a.legnumber);
        a.eggnumber=300;
        a.fly();
        a.spawn();
        Bee b=new Bee();
        System.out.println("小蜜蜂腿的数量为"+ b.legnumber);
        b.eggnumber=200;
        b.fly();
        b.spawn();
        b.makehoney();
    }
}
interface FlyAnimal{
    void fly();
}
abstract class Bird{
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
        System.out.println("小鸽子飞跑了");
    }

    @Override
    public void layEggs() {
        System.out.println("小鸽子下蛋数量："+eggnumber);
    }
}
class Swallow extends Bird implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("小燕子南飞了");
    }

    @Override
    public void layEggs() {
        System.out.println("小燕子下蛋数量："+eggnumber);
    }
    public void makehome(){
        System.out.println("小燕子用自己口水筑巢");
    }
}
class Ant extends Insect implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("蚂蚁飞走了");
    }

    @Override
    public void spawn() {
        System.out.println("蚂蚁产卵数量为："+eggnumber);
    }
}
class Bee extends Insect implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("小蜜蜂到处飞着去采蜜");
    }

    @Override
    public void spawn() {
        System.out.println("小蜜蜂产卵数量为："+eggnumber);
    }
    public void makehoney(){
        System.out.println("小蜜蜂会产蜂蜜");
    }
}