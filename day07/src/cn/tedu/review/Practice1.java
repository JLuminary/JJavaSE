package cn.tedu.review;
//练习面向对象 封装
public class Practice1 {
    public static void main(String[] args) {
        Dog d =new Dog("泡泡","小型犬","小白",2,1999.99);
        d.setHost("泡泡");
        d.setKind("小型犬");
        d.setName("小白");
        d.setAge(2);
        d.setPrice(1999.99);
        System.out.println(d.getHost());
        System.out.println(d.getKind());
        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.getPrice());
        d.run();
        d.eat(3);
        d.sleep(8.8);
        String r=d.getHost();
        d.play(r);
        System.out.println(d.play(r));
        String s=d.play(d.getHost());
        System.out.println(s);
        System.out.println(d.play(d.getHost()));
    }
}

class Dog{
    String name;
    String host;
    String kind;
    int age;
    double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Dog(String name, String host, String kind, int age, double price) {
        this.name = name;
        this.host = host;
        this.kind = kind;
        this.age = age;
        this.price = price;
    }

    public void run(){
        System.out.println("狗子天天上窜下跳的");
    }
    public void eat(int a){
        System.out.println("狗子今天吃了"+a+"大骨头");
    }
    public void sleep(double a){
        System.out.println("狗子今天睡了"+a+"小时");
    }
    public String play(String host){
        System.out.println("狗子与主人"+host+"玩的很开心");
        brak();
        return "飞盘";
    }
    private void brak(){
        System.out.println("狗子汪汪乱叫");
    }
}