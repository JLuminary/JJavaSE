package cn.tedu.oop;
//本类用于面向对象的巩固练习
public class TestCar {
    public static void main(String[] args) {
    Car c =new Car();
//    c.brand="保时捷";
//    c.color="黑色";
//    c.price=688888.88;
//    c.length=3.57;
//        System.out.println(c.brand);
//        System.out.println(c.price);
//        System.out.println(c.color);
//        System.out.println(c.length);
//        System.out.println(c.getPrice());
//        System.out.println(c.getLength());
//        System.out.println(c.getColor());
//        System.out.println(c.getBrand());
        //7.3操作set方法给所有属性赋值

        c.setBrand("奥迪");
        System.out.println(c.getBrand());
        c.setColor("活力蓝");
        System.out.println(c.getColor());
        c.setLength(4.15);
        System.out.println(c.getLength());
        c.setPrice(428888.88);
        System.out.println(c.getPrice());
        //8.通过创建好的对象调用汽车的功能
        c.start();
//      c.stop();
    }

}
//1.抽象汽车这一类事物的共同点，用class描述
class Car{
    //2.属性--用成员变量
    //7.封装所有属性
    private String brand;//品牌

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private String color;//颜色
    private double price;//价格
    private double length;//长度
    //3.功能--用方法来描述
    public void start(){
        System.out.println("汽车启动了");
        stop();
    }
    private void stop(){
        System.out.println("汽车停止了");

    }
}