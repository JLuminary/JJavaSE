package cn.tedu.reivew;
//本类用于复习代码块
public class TestBlock {
    public static void main(String[] args) {
        Person p=new Person();
        Person p1=new Person("早上好");
        p.a();

    }
}
class Person{
    {
        System.out.println("我是一个构造代码块");
    }
    public Person(){
        System.out.println("我是无参构造");
    }
    public Person(String s){
        System.out.println("我是含参构造"+s);
    }
    public void a(){
        System.out.println("我是普通方法");
        {
            int i=100;
            System.out.println("我是一个局部代码块:"+i);
        }
//        System.out.println(i);//不可以使用，因为在局部代码块中，超出了变量i的范围
    }
}
