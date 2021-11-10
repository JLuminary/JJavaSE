package cn.tedu.api;

import java.util.Objects;

//本类用于顶级父类Object的入门案例
//如何找Object呢？ 有以下几种方式：
//1.查API手册
//2.连点两下shift 打开IDEA 的搜索功能，注意勾选"include non-project item"
//在在搜索框的搜索Object
//3.在拓展库External Libraries找到jdk1.8->rt.jar->java.lang.Object
//4.按住Ctrl点击hashcode（）方法名，也可以进入Object
public class TestObject {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("张三",18,99.9,"CGB大数据A班");
        Student s3=new Student("张三",18,99.9,"CGB大数据A班");

        //测试hashcode（）
        /*本方法的作用是返回对应对象的int类的哈希码值
        *本方法力求不同的对象返回不同的哈希码值
        *这样我们就可以根据哈希码值区分不同的个对象*/
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        /*负责打印s1对象的是println（），这个方法会层层向下调用，一直到Object中的toString
        * Object类中的toString（）的默认实现打印的对象的地址值【类名@十六进制哈希码值】
        * 子类Student重写了Object中的toString（），打印的是对象的类型+属性+属性值*/
        //6.测试toString方法
        System.out.println(s2.age);
        System.out.println(s2.name);
        System.out.println(s2.score);
        System.out.println(s2.Grade);
        System.out.println(s2.toString());//不推荐
        System.out.println(s2);

        //7.测试equals
        /*Object中的equals（）的默认实现使用的是==比较
        * ==比较的时左右两边的值，如果是基本类型，比较的是字面值
        * 比如1和1,3.4和3.4
        * 如果是引用类型，比较的是引用类型变量保存的地址值*/
        System.out.println(s2.equals(s3));//true
        System.out.println(s2 == s3);//false
        /*equals（）与hashcode（）逻辑要保持一致，要重写都要重写，要不重写都不重写
        * 如果不重写：hashcode（）的哈希码根据地址值生成
        *           equals（）底层使用==比较两个对象的地址值
        * 如果重写了：hashcode（）的哈希码根据重写传入的属性值生成
        *           equals（）比较的是重写后类型+所有属性与属性值*/
    }
}
//1.创建一个学生类
class Student{
    //2.定义属性
    String name;//姓名
    int age;//年龄
    double score;///成绩
    String Grade;//年纪
    //3.1创建本类无参构造
    public Student(){
        System.out.println("我是无参构造，谢谢，不用管我");
    }
    //3.2创建本类全参构造
    public Student(String name, int age, double score, String grade) {
        System.out.println("我是本类的全参构造~");
        this.name = name;
        this.age = age;
        this.score = score;
        Grade = grade;
    }

    //生成子类重写的toString（）
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", Grade='" + Grade + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.score, score) == 0 && Objects.equals(name, student.name) && Objects.equals(Grade, student.Grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score, Grade);
    }
}