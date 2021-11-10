package cn.tedu.innercalss;

public class TestInner5 {
    public static void main(String[] args) {
        //传统的方式：创建接口+创建接口实现类+实现类实现接口中所有的抽象方法
        //创建接口实现类的对象+通过对象调用实现了功能
        new Inner5() {
            @Override
            public void eat() {
                System.out.println("我吃得好饱啊");
            }

            @Override
            public void play() {
                System.out.println("在打球");
            }
        }.eat();
        new Inner4() {
            @Override
            public void play1() {
                System.out.println("我是谁啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
            }
        }.play1();
       new Inner3().eat2();
    }
}
//创建接口
interface Inner5{
    //创建接口类的抽象方法
    void eat();
    void play();
}
//创建抽象类
abstract class Inner4{
    public  void eat1(){
        System.out.println("我是个残次品，普通方法");
    }
    public abstract void play1();
}
//创建普通类
class Inner3{
    public void eat2(){
        System.out.println("凄惨");
    }
    public void play2(){
        System.out.println("泪目");
    }
}