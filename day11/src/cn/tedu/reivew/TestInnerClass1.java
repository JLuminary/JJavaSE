package cn.tedu.reivew;
//内部类的练习
public class TestInnerClass1 {
    public static void main(String[] args) {
        A a=new A();
        a.eat();
    }
}

class A{
    int age;
    public void eat(){
        System.out.println("干饭王");
        B b=new B();
        b.find();
    }
    class B{
        public void find(){
            System.out.println(age);
            System.out.println("我是内部类");
        }
    }
}