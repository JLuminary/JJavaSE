package cn.tedu.oop;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Pigegon p=new Pigegon();
        Swallow s=new Swallow();
              p.Fly();
              System.out.println("鸽子有"+ p.legnumber+"条腿");
              p.eggnumber=6;
              p.layEggs();
              s.Fly();
             System.out.println("燕子有"+ s.legnumber+"条腿");
              s.eggnumber=8;
              s.layEggs();
             s.nesting();

            Ant a=new Ant();
            Bee b=new Bee();
              a.Fly();
             System.out.println("蚂蚁有"+ a.legnumber+"条腿");
            a.eggnumber=300;
            a.spawn();
            b.Fly();
            System.out.println("蜜蜂有"+ b.legnumber+"条腿");

            b.eggnumber=500;
            b.spawn();
            b.honey();
    }
}
interface FlyAnimal{
    void Fly();
}
abstract class Brid implements FlyAnimal{
        int legnumber=2;//小鸟腿的数量为2
        int eggnumber;//下蛋数量
    @Override
    public void Fly() {
        System.out.println("鸟类都会飞");
    }
    public abstract void layEggs();
}
abstract class Inect implements FlyAnimal{
        int legnumber=6;//昆虫类腿的数量
        int eggnumber;//产卵数量
    @Override
    public void Fly() {
        System.out.println("昆虫都会飞");
    }
    public abstract void spawn();
}
//创建子类鸽子类
class Pigegon extends Brid implements FlyAnimal{
    @Override
    public void Fly() {
        System.out.println("鸽子会飞");
    }
    @Override
    public void layEggs(){
        System.out.println("鸽子下了"+eggnumber+"个蛋");
    }
}
//创建燕子类
class Swallow extends Brid implements FlyAnimal{
    @Override
    public void Fly() {
        System.out.println("燕子子会飞");
    }
    @Override
    public void layEggs(){
        System.out.println("燕子下了"+eggnumber+"个蛋");
    }

    public void nesting(){
        System.out.println("燕子还会自己用口水筑巢");
    }
}
class Ant extends Inect implements FlyAnimal{
    @Override
    public void Fly() {
        System.out.println("蚂蚁也会飞");
    }
    @Override
    public void spawn(){
        System.out.println("蚂蚁产了"+eggnumber+"个卵");
    }
}
class Bee extends Inect implements FlyAnimal{
    @Override
    public void Fly() {
        System.out.println("蜜蜂会飞");
    }
    @Override
    public void spawn(){
        System.out.println("蜜蜂产了"+eggnumber+"个卵");
    }
    public void honey(){
        System.out.println("蜜蜂还会产蜂蜜");
    }
}