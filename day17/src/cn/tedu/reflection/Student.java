package cn.tedu.reflection;

import java.util.Objects;

/*本类用于测试反射的物料类，假装这个类是别人写的*/
public class Student {
    //1.定义成员变量
    String name;
    int age;

    //2.生成本类的无参、含参构造
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //3.提供本类的普通方法
    public void play() {
        System.out.println("玩代码");
    }

    public void eat(int a) {
        System.out.println("中午吃了" + a + "碗大米饭");
    }
}

