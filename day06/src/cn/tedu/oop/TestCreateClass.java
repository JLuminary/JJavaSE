package cn.tedu.oop;
//本类用于练习面向对象的入门案例
/*在一个Java文件当中可以写多个class，但是被public修饰的class只能有一个
* 而且这个公共类的名字要求就是当前文件名字*/
public class TestCreateClass {
    public static void main(String[] args) {
    //通过new关键字创建对应类的对象
        Phone p=new Phone();//p 保存的是地址值
        //5.通过创建好的对象使用类中的功能
        p.call();
        p.message();
        p.video();
        //6.通过创建好的对象查看属性值
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.size);
        System.out.println(p.color);
        //7.创建手机类的第二个对象
        Phone p2=new Phone();
        //8.通过p2对象调用Phone类的3个功能
        p2.video();
        p2.call();
        p2.message();
        //9.给p2对象的属性赋值并查看
        p2.brand="华为";
        p2.color="五彩色";
        p2.price=69999;
        p2.size=6.7;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        System.out.println(p2.color);
        System.out.println(p2.size);
    }
}
//1.通过class关键字来创建手机类-用来描述手机这一类事物-设计图纸
//类是一类抽象事物
class Phone{
    //特征/属性--类的成员变量来描述--定义在类里方法外
    String brand;//品牌
    double price;//价格
    double size;//尺寸
    String color;//颜色

    //3.定义手机的功能--通过类的方法来描述--修饰符 返回值类型 方法名 参数列表 方法体
    public void call(){
        System.out.println("正在打电话");
    }
    public void message(){
        System.out.println("正在发短信");
    }
    public void video(){
        System.out.println("正在看直播~");
    }
}