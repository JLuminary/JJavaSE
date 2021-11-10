package cn.tedu.oop2;
//本类用于汽车设计案例
public class DesignCar {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getColor());//默认值null
        c.start();
        c.stop();
//      c.swim();//报错，父类对象不可以调用子类的特有对象
        BMW b = new BMW();
        System.out.println(b.color);
        System.out.println(b.getColor());//null
        b.start();
        b.stop();
        //11.创建多态对象进行测试
        Car c1 = new TSL();
//        System.out.println(c1.color);
        System.out.println(c1.getColor());
        c1.start();
        c1.stop();
        System.out.println("我是无情分界线");
        TSL t=new TSL();

        get(b);
        get(t);
    }
        public static void get (Car c){
            c.stop();
            c.start();

    }
}
//1.通过分析，抽象形成一个汽车类
class Car{
    //2.定义并封装汽车的属性--成员变量
    private String brand;//品牌
    private String color;//颜色
    private int id;//编号
    private double price;//价格

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
        System.out.println("唉呀妈呀熄火了");
    }
}
//4.创建子类1--
class BMW extends Car{
    String color="五彩斑斓的黑";
    @Override
    public void start(){
        System.out.println("都让开,我的车要起飞了");
    }

}
//6.创建子类2
class TSL extends Car{
    //重写方法
    @Override
    public void start(){
        System.out.println("唉呀妈呀怎么停不下来呢，我草刹车坏了md");
    }
    //8.添加子类的特有功能
    public void swim(){
        System.out.println("没想到吧啊，我他喵是个潜水艇");
    }
}