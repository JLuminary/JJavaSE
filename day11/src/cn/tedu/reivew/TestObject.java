package cn.tedu.reivew;

import java.util.Objects;

public class TestObject {
    private static Student s;

    public static void main(String[] args) {
        Student s=new Student("张三",18,123456,"CGB大数据");
        Student s1=new Student("张三",18,123456,"CGB大数据");
        System.out.println(s.hashCode());
        System.out.println(s);
        System.out.println(s.equals(s1));
    }
}
class Student{
    String name;
    int age;
    int id;
    String grade;
    public Student(){
        System.out.println("我是无参构造");
    }

    public Student(String name, int age, int id, String grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && id == student.id && Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id, grade);
    }
}