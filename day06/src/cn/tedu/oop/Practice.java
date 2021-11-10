package cn.tedu.oop;
//本类用于复习封装
public class Practice {
    public static void main(String[] args) {
        Dog d=new Dog();
        Dog d1=new Dog();
        d1.setName("哮天犬");
        d1.setAge(999);
        d1.setKind("猎狗");
        d1.setHost("二郎神");
        d1.setPrice(100000);
        System.out.println("狗子年龄："+d1.getAge());
        System.out.println("狗子主人："+d1.getHost());
        System.out.println("狗子品种："+d1.getKind());
        System.out.println("狗子名字："+d1.getName());
        System.out.println("狗子价格:"+d1.getPrice());
        d.setAge(2);
        d.setHost("小明");
        d.setKind("中型犬");
        d.setName("小白");
        d.setPrice(1999.99);
        System.out.println("狗子年龄："+d.getAge());
        System.out.println("狗子主人："+d.getHost());
        System.out.println("狗子品种："+d.getKind());
        System.out.println("狗子名字："+d.getName());
        System.out.println("狗子价格:"+d.getPrice());
        d.run();
        d.eat(2);
        d.sleep(3.5);
        d.play(d.getHost());
//        System.out.println(d.play("小明"));
        d.play(d.getHost());
        String r= d.play(d.getHost());
        System.out.println(r);
        System.out.println(d.play(d.getHost()));
    }
}

class Dog{
    private String name;

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

    private int age;
    private String kind;
    private  String host;
    private double price;

  public void run(){
        System.out.println("狗狗跑起来跑起来");
    }
    public void eat(int a){
        System.out.println("狗子吃饭了,吃了"+a+"大骨头");
    }
    public void sleep(double a){
        System.out.println("狗子已经睡了"+a+"小时");
    }
    public String play(String host){
        System.out.println("狗子与主人"+host+"玩的很开心");
        bark();
        return "飞盘";
        //遇到return时，已经结束本方法了，return后不可以直接写代码
    }
    private void bark(){
        System.out.println("狗子汪汪汪乱叫~~~");
    }
}