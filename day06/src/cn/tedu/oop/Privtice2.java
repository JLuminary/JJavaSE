package cn.tedu.oop;

public class Privtice2 {
    public static void main(String[] args) {
        Phone1 p=new Phone1();
        p.brand="苹果";
        p.color="远峰蓝";
        p.price=6999.99;
        p.size=6.7;
        System.out.println(p.brand);
        System.out.println(p.color);
        System.out.println(p.price);
        System.out.println(p.size);
        p.call();
        p.message();
        p.vioed();
    }
}

class Phone1{
    String brand;
    String color;
    double price;
    double size;

    public void call(){
        System.out.println("正在打电话~");
    }
    public void message(){
        System.out.println("正在发短信~");
    }
    public void vioed(){
        System.out.println("正在看视频~");
    }
}