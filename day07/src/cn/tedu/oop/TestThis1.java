package cn.tedu.oop;
//本类用于this测试
public class TestThis1 {
    public static void main(String[] args) {
        Cat c =new Cat();
        c.eat();
    }
}
//1.创建小猫类
class Cat{
    //5.创建一个成员变量
    int count =666;
    int sum =100;
    //2.创建方法
    public void eat(){
        //3.创建局部变量
        int sum=10;
        System.out.println(sum);//10
        /*当成员变量与局部变量同名时，可以使用this指定本类的成员变量
        * 如果不使用this指定，打印的就是近处的这个局部变量，就近原则*/
        System.out.println(this.sum);//100
        System.out.println(count);//666
    }
}