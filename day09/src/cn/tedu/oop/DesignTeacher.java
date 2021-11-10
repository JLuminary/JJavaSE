package cn.tedu.oop;
//本类用于面向对象抽象编程的老师类
public class DesignTeacher {
    public static void main(String[] args) {
        CGBTeacher ct = new CGBTeacher();
        SCDTeacher st = new SCDTeacher();
        ASDTeacher at = new ASDTeacher();
        st.ready();
        st.teach();
        ct.ready();
        ct.teach();
        at.teach();
        at.ready();
    }
}
//属性：姓名 工号
//方法：备课 授课
abstract class Teacher{
    String name;
    int id;
    public abstract void ready();
    public abstract void teach();
}
//1.创建培优班老师类--主打电商项目
class CGBTeacher extends Teacher{
    public void ready(){
        System.out.println("备课电商项目");
    }
    public void teach(){
        System.out.println("授课电商项目");
    }
}
//创建SCD大数据老师类
class SCDTeacher extends  Teacher{
    public void ready(){
        System.out.println("备课hsdoop spark");
    }
    public void teach(){
        System.out.println("授课hsdoop spark");
    }
}
class ASDTeacher extends Teacher{

    @Override
    public void ready() {
        System.out.println("备课ing");
    }

    @Override
    public void teach() {
        System.out.println("授课ing");
    }
}