package cn.tedu.reivew;
//本类用于接口复习2
public class TestInter2 {
    public static void main(String[] args) {
        Inter4impl i=new Inter4impl();
        i.add();
        i.delete();
        i.update();
        i.find();
        i.eat();
    }
}
//接口2定义两个方法
interface Inter2{
    void add();//增
    void delete();//删
}
//接口3里面定义两个方法
interface Inter3{
    void update();//改
    void find();//查
}
interface Inter4 extends Inter2,Inter3{
    void eat();
}
class Inter4impl implements Inter4{

    @Override
    public void add() {
        System.out.println("我是增");
    }

    @Override
    public void delete() {
        System.out.println("我是删");
    }

    @Override
    public void update() {
        System.out.println("我是改");
    }

    @Override
    public void find() {
        System.out.println("我是查");
    }

    @Override
    public void eat() {
        System.out.println("我是干饭王，谢谢");
    }
}
