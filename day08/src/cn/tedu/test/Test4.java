package cn.tedu.test;
//复习汽车设计案例DesignCar
public class Test4 {
    public static void main(String[] args) {
        System.out.println(1-0.8);
        Car c=new Car();
        c.start();
        c.stop();
        BMW b=new BMW();
        b.start();
        b.stop();
        System.out.println(b.color);
        TSL t=new TSL();
        t.start();
        t.stop();
        Car c1=new TSL();
        c1.start();
        c1.stop();
//        c1.swim();
        System.out.println(c1.getColor());
      get(c);
      get(b);
      get(t);
    }
    public static void get(Car c){
        c.stop();
        c.start();
    }
}
//定义汽车类
class Car{
    //定义汽车属性-并封装
    private String brand;
    private String color;
    private int id;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //3.定义功能
    public void start(){
        System.out.println("我的小汽车启动了");
    }
    public void stop(){
        System.out.println("我的小汽车停止了");
    }
}
class BMW extends Car{
    String color="刺瞎你24k眼";
    public void start(){
        System.out.println("我的小汽车起飞了~666");
    }
    public void stop(){
        System.out.println("我他喵车熄火了");
    }
}
class TSL extends Car{
    public void start(){
        System.out.println("我的小汽车在天上飞");
    }
    public void swim(){
        System.out.println("买车这麽久刚发现，车还是个潜水艇");
    }
}