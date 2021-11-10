package cn.tedu.inter2;
/*本类用于面向接口编程*/
public class TestTeacherInter {
    public static void main(String[] args) {
        CGBTeacher c=new CGBTeacher();
        c.ready();
        c.teach();
        System.out.println(Teacher.a);
    }
}
interface Teacher{
    int a=10;
 void ready();   //授课方法
 void teach();   //讲课方法
}
class CGBTeacher implements Teacher{

    @Override
    public void ready() {
        System.out.println("备课CGB");
    }

    @Override
    public void teach() {
        System.out.println("讲课CGB");
    }
}
abstract class ACTTeacher implements Teacher{

    @Override
    public void ready() {
        System.out.println("备课ACT");
    }

    @Override
    public void teach() {
        System.out.println("授课ACT");
    }
}