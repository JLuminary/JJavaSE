package cn.tedu.serializable;

import java.io.Serializable;

//本类用来封装学生类
/*如果奔雷的对象要想序列化输出，必须实现可序列化接口Serializable
 * 否则会报错，*/
public class Student implements Serializable {
    /*JVM会给每个要序列化输出的类分配一个唯一的UID
    * 只要更改了这个类，自动生成的默认UID就会改变
    * */
    //这是我们手动写死提供的，永远都是1L，但是不推荐
    //private static final long serialVersionUID=1L;
    //1.定义学生类的相关属性
    private String name;//名字
    private int age;//年龄
    private String addr;//住址
    private char gender;//性别


    //2.1创建本类的无参构造
    public Student() {
        System.out.println("我是Student的无参构造");
    }

    //2.2创建本的全参构造
    public Student(String name, int age, String addr, char gender) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.gender = gender;
    }

    //1.2给被封装的属性添加get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", gender=" + gender +
                '}';
    }
}
