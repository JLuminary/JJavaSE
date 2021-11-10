package cn.tedu.reivew;

public class TestOOP1 {
    public static void main(String[] args) {
        Teacher1 t=new Teacher1();
        Student s=new Student();
        Parent p=new Parent();
        t.eat();
        t.sleepp();
        s.eat();
        s.sleepp();
        p.eat();
        p.sleepp();
    }
}
interface Person{
    void eat();
    void sleepp();
}
class Teacher1 implements Person{

    @Override
    public void eat() {
        System.out.println("老师在教职工食堂吃饭");
    }

    @Override
    public void sleepp() {
        System.out.println("老师在教职工公寓睡觉");
    }
}
class Student implements Person{

    @Override
    public void eat() {
        System.out.println("学生在学生食堂吃饭");
    }

    @Override
    public void sleepp() {
        System.out.println("学生在学生宿舍睡觉");
    }
}
class Parent implements Person{

    @Override
    public void eat() {
        System.out.println("家长在招待所吃饭");
    }

    @Override
    public void sleepp() {
        System.out.println("家长在招待所睡觉");
    }
}