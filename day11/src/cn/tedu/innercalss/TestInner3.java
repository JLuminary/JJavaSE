package cn.tedu.innercalss;
/*本类用于测试内部类被static修饰*/
public class TestInner3 {
    public static void main(String[] args) {
        //4.1创建普通内部类对象并调用内部类功能
//        Outer3.Inner3 i = new Outer3().new Inner3();
//        i.show();
//        //4.2创建匿名对象并调用内部类的功能
//        new Outer3().new Inner3().show();
//
        /*现象：当成员内部类被static修饰以后 new Outer3（）外部类对象会报错
        * 结论：创建静态成员内部类对象时，不需要先创建外部类对象，直接通过类名调用*/
        Outer3.Inner3 oi=new Outer3.Inner3();
        oi.show();
        new Outer3.Inner3().show();
        //8.访问静态内部类的静态资源--链式加载
        Outer3.Inner3.show1();
    }
}
//创建外部类
class Outer3{
    //创建成员内部类
    //5.测试成员内部类被static修饰--并不常用！！浪费内存
    static class Inner3{

        //创建成员内部类的方法
        public  void show(){
            System.out.println("我是内部类的Inner的show（）");
        }
        //7创建一个静态方法
        public static void show1(){
            System.out.println("我是内部类的Inner的show1（）");
        }
    }
}
