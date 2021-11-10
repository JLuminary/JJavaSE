package cn.tedu.oop;
//本类用于构造函数的入门案例
public class TestConsructor {
    public static void main(String[] args) {
        //创建Person类的对象
        /*1.每次new对象时，都会自动触发对应类中的构造方法
        * 2.每一个类中，都会默认存在一个没有参数的构造方法
        * 但是如果提供其他构造函数，默认的无参构造会被覆盖
        * 所以要手动的提供无参构造，这样才能不传参数，也能创建对象*/
        Person p=new Person();
        p.name="小明";
        System.out.println(p.name);
        System.out.println(p.address);
        System.out.println(p.age);
        p.eat();
        /*Java是一门面向对象的语言
        * 每次创建对象都会执行一个构造方法
        * 构造方法的作用：用来创建对象的*/
        Person p1=new Person(88);
        System.out.println(p1.name);
        /*5.全参构造不仅可以创建对象，还可以给对象的所有属性赋值*/
        Person p2=new Person("小明",18,"湖边长板凳");
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.address);
    }
}
//创建一个Person，描述人
class Person{
    //2.定义属性
    String name;//名字
    int age;//年龄
    String address;//住址
    /*.构造方法的格式与本类类名同名且没有返回值类型的方法*/
    //5.创建本类的无参构造
    public Person(){
        System.out.println("我是Person类没有参数的构造");
    }
    //5.2创建本类的含参构造
    public Person(int a){
        System.out.println("我是Person类的含参构造，今天中午吃"+a+"碗大米饭");
    }
    //创建本类全参构造--此构造函数的参数与本类的属性一致

    public Person(String name, int age, String address) {
        System.out.println("我是Person类的全参构造");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //创建方法
    public int eat(){
        System.out.println("端起了我的饭盆");
        return 00;
    }
}