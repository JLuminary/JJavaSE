package cn.tedu.reivew;

import java.util.Objects;

//本类用于复习Objcet类
/*1.s对象与s1对象new了两次，地址值不同！
* 2.s对象与s1对象的属性属性值一模一样
* 3.toString（）是puintln（）向下逐级调用的，不需要我们主动调用*/
public class TestObject {
    public static void main(String[] args) {
        //2.创建自定义对象
        Student1 s=new Student1("海绵宝宝",18);
        Student1 s1=new Student1("海绵宝宝",18);

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s == s1);//false
        System.out.println(s.equals(s1));//false
        System.out.println(s);
        System.out.println(s1);
    }
}
class Student1{
    //1.1创建自定义类的属性
    String name;
    int age;
    //1.2创建自定义类的构造函数
    public Student1(){
        System.out.println("我是无参构造");
    }

    public Student1(String name, int age) {
        System.out.println("我是全参构造");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}