package cn.tedu.practice;
//10.13练习面向对象
public class Practice {
    public static void main(String[] args) {
        Dog d=new Dog(2);
//        Dog d1=new Dog(2);

        d.setName("小黑");
        d.setKing("小型犬");
        d.setHost("大白");
        d.setAge(2);
        d.setPrice(599.99);
        System.out.println(d.getName());
        System.out.println(d.getKing());
        System.out.println(d.getHost());
        System.out.println(d.getAge());
        System.out.println(d.getPrice());
        d.run();
        d.eat(5);
        System.out.println(d.sleep(5.4));
    }
}
class Dog{
    {
        System.out.println("我是构建代码块");
    }
    public Dog(){
        System.out.println("我是构建方法");
    }
    public Dog(int a){
        System.out.println("我是含参的构建方法"+a);
    }
    String name;
    String king;
    String host;
    int age;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKing() {
        return king;
    }

    public void setKing(String king) {
        this.king = king;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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

    public void run(){
        System.out.println("狗子跑起来~");
    }
    public void eat(int a){
        System.out.println("狗子今天吃了"+a+"根大骨头");
    }
    public String sleep(double a){
        System.out.println("狗子今天睡了"+a+"个小时");
        brak();
        return "飞盘";
    }
    private void brak(){
        System.out.println("狗子汪汪叫");
    }
}
