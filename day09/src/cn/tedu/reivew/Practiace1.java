package cn.tedu.reivew;

public class Practiace1 {
    public static void main(String[] args) {
        Animal d=new Dog1();
        Animal c=new Car1();
//        d.age=18;
//        System.out.println(d.age);
//        c.price=3.21;
//        System.out.println(c.price);
        d.run();
        d.jump();
        c.run();
        c.jump();
        d.setAge(15);
        System.out.println(d.getAge());
        c.setAge(1);
        System.out.println(c.getAge());
    }
}
abstract class Animal{
    static{
        System.out.println("我是你大爷");
    }
    {
        System.out.println("我是静态代码块");
    }
    public Animal(){
        System.out.println("我是无参构造");
    }
    private String name;
    private int age;
    private String kind;
    private String host;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void run();
    public abstract void jump();
}
class Dog1 extends Animal{
    public Dog1(){
        super();
    }
    @Override
    public void run(){
        System.out.println("狗子跑的真快");
    }
    public void jump(){
        System.out.println("狗子跳的真高啊");
    }
}
class Car1 extends Animal{
    public Car1(){
        this.jump();
    }
    @Override
    public void run(){
        System.out.println("小猫跑的真快");
    }
    public void jump(){
        System.out.println("小猫跳的真高啊");
    }
}