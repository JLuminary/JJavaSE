package cn.tedu.review;
//本类用于复习面向对象案例
public class TestPhone {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.setBrand("苹果");
        p.setSize(6.7);
        p.setPrice(12999.99);
        p.setColor("远峰蓝");
        System.out.println("手机品牌："+p.getBrand());
        System.out.println("手机尺寸："+p.getSize());
        System.out.println("手机颜色："+p.getColor());
        System.out.println("手机价格："+p.getPrice());
        //创建第二个对象
        Phone p2=new Phone();
        p2.call();
//        p2.message();
        p2.video();
        p2.music();

    }
}

//创建手机类
class Phone{
    //.创建手机类的属性 品牌 尺寸 价格 颜色
    private String brand;
    private double size;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//创建手机类的方法
    public void call(){
        System.out.println("正在打电话~");
    }
    private void message(){
        System.out.println("正在发短信~");
    }
    public void video(){
        System.out.println("正在看直播");
    }
    public void music(){
        System.out.println("正在听音乐~");
        message();
    }
}