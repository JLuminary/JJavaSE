package cn.tedu.innercalss;
//本类用于测试局部内部类
public class TestInner4 {
    public static void main(String[] args) {
        /*如何使用局部内部类的资源呢？
        * 注意 直接调用外部类的show方法是无法触发局部内部类的功能的
        * 要执行局部内部类的功能，必须先创建局部内部类的对象并调用对应的功能*/
        new Outer4().show();
    }
}
//创建外部类
class Outer4{
    //创建外部类的成员方法
    public void show(){
        System.out.println("Outerde show()");
        //创建局部内部类
        /*局部内部类位置：方法里*/
        class Inner4{
            String name;
            int age;
            public void eat(){
                System.out.println("Inner的 eat（）");
            }
        }
        //6.创建局部内部类的对象，并调用局部内部类的功能
        Inner4 i=new Inner4();
        System.out.println(i.name);
        System.out.println(i.age);
        i.eat();
    }
}