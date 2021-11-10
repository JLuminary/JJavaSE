package cn.tedu.innerclass;
//本类用于内部类的入门案例
public class TestInner1 {
    public static void main(String[] args) {
        //创建内部类对象
        /*外部类名.内部类名 对象名 =外部类对象.内部类对象*/
        Outor.Inner i= new Outor().new Inner();
        i.delete();
        System.out.println(i.sum);
        new Outor().find();
    }
}
//1.创建外部类
class Outor{
    //1.1创建外部类的成员变量
    String name;
    private int age;
    //1.2创建外部类的成员方法
    public void find(){
        System.out.println("Outor.....find()");
        /*外部类如果想用内部类的资源，必须先创建内部类的对象
        * 然后通过内部类的对象来调用内部类的资源*/
//        System.out.println(sum);//不能直接使用内部类的属性
//        delete();
        Inner i=new Inner();
        System.out.println(i.sum);
        i.delete();
    }
    //2.定义内部类--外部类的特别成员
    /*根据内部类所在位置不同，分为：成员内部类（类里方法外）与局部内部类（类里方法里）*/
    class Inner{
        //2.1定义成员变量
        int sum=10;
        //2.2定义成员方法
        public void delete(){
            System.out.println("Inner.....delete()");
            //5.内部类是否可以使用外部类的资源
            /*结论：内部类可以直接使用外部的资源，包括私有资源*/
            System.out.println(name);
            System.out.println(age);
//            find();
        }
    }
}