package cn.tedu.exec;
//本类用于oop综合案例2-设计图形业务
public class TestShape {
    public static void main(String[] args) {
//        Shape s=new Shape();
//        s.draw();
//        s.clear();
//        s.draw();
        Circle c=new Circle();
        c.draw();
        c.clear();
        Square s=new Square();
        s.draw();
        s.clear();
        s.area();
    }
}
//1.创建父类
abstract  class Shape{
    public abstract void draw();
    public void clear(){
        System.out.println("\n\n\n\n\n\n");
    }
}
//2.创建子类圆形
class Circle extends Shape{
    public void draw(){
        System.out.println("画个○");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("画个□");
    }
    public void area(){//子类特有的方法
        System.out.println("这个方形的面积不太大");
    }
}