package cn.tedu.reivew;
//面向对象综合测试
public class TestOOP {
    public static void main(String[] args) {
        Pigeon p=new Pigeon();
        p.fly();
        p.eggnumber=6;
        p.layEggs();
        Swallow s=new Swallow();
        s.fly();
        s.eggnumber=8;
        s.layEggs();
        s.makehome();
        Ant a=new Ant();
        a.fly();
        a.eggnumber=300;
        a.spawn();
        Bee b=new Bee();
        b.fly();
        b.eggnumber=200;
        b.spawn();
        b.honey();
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
        System.out.println("鸽子飞走了");
    }

    @Override
    public void layEggs() {
        System.out.println("鸽子下蛋的数量："+eggnumber);
    }
}
class Swallow extends Bird implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("小燕子飞走了");
    }

    @Override
    public void layEggs() {
        System.out.println("小燕子下蛋数量："+eggnumber);
    }
    public void makehome(){
        System.out.println("小燕子会用口水搭窝");
    }
}
class Ant extends Insect implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("蚂蚁会飞你相信吗？");
    }

    @Override
    public void spawn() {
        System.out.println("蚂蚁产卵数："+eggnumber);
    }
}
class Bee extends Insect implements FlyAnimal{

    @Override
    public void fly() {
        System.out.println("蜜蜂到处飞去 采蜜");
    }

    @Override
    public void spawn() {
        System.out.println("蜜蜂产卵数："+eggnumber);
    }
    public void honey(){
        System.out.println("一只成年蜜蜂一年可以产蜜100吨");
    }
}