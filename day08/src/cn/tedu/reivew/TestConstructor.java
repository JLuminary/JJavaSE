package cn.tedu.reivew;
//本类用于练习构造函数
public class TestConstructor {
    public static void main(String[] args) {
        Student t=new Student();
        Student t1=new Student("早上好");
        Student t2=new Student("小明",18,'男');
        System.out.println(t2.name+t2.age+t2.gender);
        Ls l=new Ls();

    }
}
class Student{
    String name;//名字
    int age;//年龄
    char gender;//性别

    public Student(){
        System.out.println("我是无参构造");
    }

    public Student(String s){
        System.out.println("我是含参构造："+s);
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("我是"+name+"今年"+age+"岁"+"性别"+gender);
    }
}
class Ls extends Student{
    int score;//分数
    String sClass;//班级
    public Ls(){
        super("哈哈哈");
        System.out.println("子类无参构造");
    }
}
