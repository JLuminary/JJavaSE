package cn.tedu.oop;
//本类练习封装组合练习
public class Practice1 {
    public static void main(String[] args) {
        Pig p=new Pig();
        p.setName("啊屁");
        p.setAge(2);
        p.setKind("小型猪");
        p.setHost("小明");
        p.setPrice(95412.11);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getKind());
        System.out.println(p.getHost());
        System.out.println(p.getPrice());
        p.run();
        p.eat(2);
        p.sleep(12.6);
        System.out.println(p.play(p.getHost()));
    }
}

class Pig{
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



    public void run(){
        System.out.println("猪猪每天跑跑跳跳");
    }
    public void eat(int a){
        System.out.println("猪猪今天吃了"+a+"顿饭");
    }
    public void sleep(double a){
        System.out.println("猪猪今天睡了"+a+"个小时");
    }
    public String play(String host){
        System.out.println("猪猪今天和"+host+"玩的很开心");
        brak();
        return "飞盘";
    }
    private void brak(){
        System.out.println("猪猪每天叫叫gegege");
    }
}