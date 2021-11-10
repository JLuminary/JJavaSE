package cn.tedu.oop;

import java.util.Arrays;

/*本类用于实现动物商店的设计案例*/
public class TestAnimalShop {
    public static void main(String[] args) {
        //开始测试
        AnimalShop as=new AnimalShop();
        as.ShopName = "垶型宠物店";
        System.out.println("欢迎来到"+as.ShopName);
        System.out.println(Arrays.toString(as.animals));

        Cat cat=new Cat();
        cat.name="小白";
        cat.age=3;
        //将创建好的小猫对象存入数组
        as.animals[0] = cat;

        //5.1--叫罗小黑5岁的猫
        Cat cat2=new Cat();
        cat2.name="罗小黑";
        cat2.age=5;
        as.animals[1]=cat2;
        //6.1创建一只狗旺财的4岁狗
        Dog dog=new Dog();
        dog.name="旺财";
        dog.age=4;
        as.animals[2]=dog;

        //7.1创建一只叫银子的500岁的鸟
        Bird bird = new Bird();
        bird.name="银子";
        bird.age=500;
        as.animals[3]=bird;

        Dog dog2 = new Dog();
        dog2.name="黑子";
        dog2.age=13;
        as.animals[4]=dog2;

        as.animals[0].eat();
        as.animals[4].eat();
        for (int i = 0; i < 5; i++) {
            System.out.println(as.animals[i].name+as.animals[i].age);

        }
    }
}

//1.创建动物类的父类
class Animal {
    //2.定义动物的类的属性
    public String name;
    public int age;

    //3.定义动物的方法
    public void eat() {
        System.out.println("小动物Animal吃啥都行");
    }
}

//创建子类小猫类
class Cat extends Animal {
    //5.继承重写的方法
    @Override
    public void eat() {
        System.out.println("小猫爱吃小鱼干");
    }

    //6.添加子类的特有特征
    public void miaoMiao() {
        System.out.println("小猫喜欢喵喵叫");
    }
}

//7.创建子类小鸟类
class Bird extends Animal {
}

//8.创建子类小狗类
class Dog extends Animal {
}

class AnimalShop {
    //10.定义属性
    public String ShopName;
    //准备一个Animal类型的数组，用来存放小动物对象，长度为5
    public Animal[] animals = new Animal[5];

    //11.1 定义宠物商店的功能--查询小动物
    public Animal query(int i) {
        //传入下标 也就是小动物下标，代表了小动物的编号，返回组中对应的小动物对象
        return animals[i];
    }

    //11.2定义宠物商店的功能2--购买小动物
    public void buy(Animal animal) {
        System.out.println("恭喜您要带" + animal.name + "回家了");
        System.out.println("它" + animal.age + "岁了，你要好好照顾它哟~~");
    }

}