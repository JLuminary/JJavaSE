package cn.tedu.reivew;
//本类用于复习接口
public class TestInter1 {
    public static void main(String[] args) {
//        Inter1 i=new Inter1();//接口不可以实例化
        Inter1impl i=new Inter1impl();
        i.eat();
        i.play();
    }
}
//1.定义接口
interface Inter1{
    //2.定义接口的静态常量
    int age=10;
    public static final int sum=20;
    //3.定义接口的方法
    public abstract void eat();//可以简写
    void play();
}
//4.创建接口实现类
class Inter1impl implements Inter1{
    @Override
    public void eat() {
        System.out.println("今天吃饭了吗？");
    }

    @Override
    public void play() {
        System.out.println("今天玩得开心吗？");
    }
}
