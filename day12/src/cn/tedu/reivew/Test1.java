package cn.tedu.reivew;

import java.util.Objects;

//本类用于复习测试Object
public class Test1 {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student("张三",18,123456);
        Student s2=new Student("张三",18,123456);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2.equals(s1));//重写前 false//重写后 true
        //Object重写前 比较的是两个的地址值 重写后 比较的是两个的所有属性值 和属性
    }
}
class Student{
    String name;
    int age;
    int id;
    public Student(){
        System.out.println("我是无参构造");
    }

    public Student(String name, int age, int id) {
        System.out.println("我是全参构造");
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
