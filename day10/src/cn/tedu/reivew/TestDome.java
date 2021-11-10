package cn.tedu.reivew;
//本类用于复习多态
public class TestDome {
    public static void main(String[] args) {
        /*父类引用子类对象*/
        Animal a=new Dog();
        a.eat();/*使用的方法是父类声明，子类的方法*/
        System.out.println(a.sum);//10

    }
}
//1.创建父类
class Animal{
    int sum=10;
    //3.定义父类的方法
    public void eat(){
        System.out.println("吃啥都行");
    }
}
//2.创建子类
class Dog extends Animal{
    int sum=100;
    //4.子类的重写方法
    @Override
    public void eat(){
        System.out.println("小狗爱吃狗不理包子");
    }
}