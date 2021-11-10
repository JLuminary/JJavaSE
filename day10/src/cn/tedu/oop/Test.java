package cn.tedu.oop;

public class Test {
    public static void main(String[] args) {
        //创建3个接口类的对象
        Teacher t=new Teacher();
        Student s=new Student();
        Parent  p=new Parent();
        //通过对象调用方法测试
        t.eat();
        t.sleep();
        System.out.println("------------");
        s.eat();
        s.sleep();
        System.out.println("------------");
        p.eat();
        p.sleep();
    }
}
//定义一个接口，描述人这一类事物以及共有功能
interface Person{
    //面向接口编程:接口的设计要方便和后续实现类的统一
    //2.设计出共同的功能
    void eat();//吃饭
    void sleep();//睡觉
}
class Teacher implements Person {

    @Override
    public void eat() {
        System.out.println("老师教师食堂吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("老师在学校公寓");
    }
}
class Student implements Person{


    @Override
    public void eat() {
        System.out.println("学生在学生食堂吃饭");
    }
    @Override
    public void sleep() {
        System.out.println("学生在学生宿舍睡觉");
    }
}
class Parent implements Person {

    @Override
    public void eat() {
        System.out.println("家长在招待所吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("家长在招待所睡觉");
    }
}