package cn.tedu.oop;
//本类用于oop总和练习
public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        Teacher t2=new Teacher("八戒");
        Teacher t3=new Teacher("八戒","男",18,10000.99);

        //给t1所有对象赋值并查看
        t1.setName("唐僧");
        t1.setGender("男");
        t1.setAge(33);
        t1.setSalary(1999.69);
        System.out.println(t1.getName());
        System.out.println(t1.getGender());
        System.out.println(t1.getAge());
        System.out.println(t1.getSalary());
        System.out.println(t1.ready());
        t1.teach("CGB");
    }
}
//1.创建老师类
class Teacher{
    //2.创建本类的属性并进行封装：姓名name 性别 gender 年龄 age 薪资 salary
    private String name;//姓名
    private String gender;
    private int age;
    private double salary;
    //3.1 创建本类的无参构造
    //3.2创建本类的含参构造
    //3.3创建本类的全参构造
    public Teacher(){
        System.out.println("无参构造");
    }
    public Teacher(String n){
        System.out.println("含参构造"+n);
    }

    public Teacher(String name, String gender, int age, double salary) {
        System.out.println("全参构造");
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //4.1创建本类的普通方法1
    public String ready(){
        System.out.println("正在上课~");
        return "产出课程+1";
    }
    //4.2创建本类的普通方法2
    public void teach(String subject) {
        System.out.println("正在授课：" + subject);
    }
}