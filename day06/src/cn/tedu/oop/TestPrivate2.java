package cn.tedu.oop;
/*本类用于测试面向对象的第一大特性--封装*/
public class TestPrivate2 {
    public static void main(String[] args) {
        Student a=new Student();
//        a.name="小明";
//        a.sum=201962159;
//        System.out.println(a.sum);
//        System.out.println(a.name);
        a.study();
        a.eat();
        a.sleep();
        System.out.println(a.getSum());
        System.out.println(a.getName());
        System.out.println(a.getSubject());
        a.setName("小明");
        System.out.println(a.getName());
        a.setSubject("CGB");
        System.out.println(a.getSubject());
        a.setSum(10086);
        System.out.println(a.getSum());
    }
}
//1.使用一个类描述学生这一类型
class Student{
    //2.定义学生属性:学号 姓名 科目
     private int sum=12234;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private String name="sjdan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//3.定义学生的功能

    private String subject="sjdansd";

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void study(){
        System.out.println("别闹，学习呢");
    }public void eat(){
        System.out.println("干饭不积极，思想有问题");
    }public void sleep(){
        System.out.println("我一点也不想谁家，就想学Java");
    }


}