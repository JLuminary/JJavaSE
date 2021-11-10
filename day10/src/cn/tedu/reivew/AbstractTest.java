package cn.tedu.reivew;
//本类用于练习抽象
public class AbstractTest {
    public static void main(String[] args) {
        Teacher t=new CGBTeacher();
    }
}
//1.创建父类
abstract class Teacher{
    //2.定义属性
    String name;//名字
    int id;//工号
    //3.创建抽象方法：备课 授课
    public abstract void ready();
    public abstract void teach();

}
class CGBTeacher extends Teacher{
    //添加父类中没有实现的抽象方法
    @Override
    public void ready(){
        System.out.println("正在备课CGB");
    }
    @Override
    public void teach(){
        System.out.println("正在教课CGB");
    }
}
//如果子类实现的是部分/一个也没有实现 抽象父类的抽象方法，那么子类是抽象类
abstract class ACTTeacher extends Teacher{
    @Override
    public void ready(){
        System.out.println("正在备课ACT");
    }
}
