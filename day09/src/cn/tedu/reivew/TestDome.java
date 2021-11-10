package cn.tedu.reivew;
//本类用于练习多态
public class TestDome {
    public static void main(String[] args) {
        //5.创建一个多态对象进行测试
        //继承+重写 & 父类引用指向子类对象 & 编译看左边，运行看右边
        Fruite f=new Fruite();//纯纯的父类对象
        Fruite f1=new Apple();
        Fruite f2=new Lemon();
        f.clean();
        f1.clean();
        f2.clean();
        System.out.println(f.name);
        System.out.println(f1.name);//水果
        System.out.println(f2.name);//水果
        /*不管是父类还是子类对象，都可以调用getFruit
        * 原因；利用多态，将子类类型的对象看作父类类型*/
        getFruite(f);
        Apple a=new Apple();
        getFruite(a);
        Lemon l=new Lemon();
        getFruite(l);

    }
    public static void getFruite(Fruite f){
        f.clean();


    }
}
//1.创建父类水果类
class Fruite{
    String name="水果";
    public void clean() {
        System.out.println("父类的clean方法");
    }
}
//2.创建子类苹果
class Apple extends Fruite{
    String name="苹果";
    @Override
    public void clean() {
        System.out.println("苹果类的clean方法");
    }
}
//3.创建子类柠檬
class Lemon extends Fruite{
    String name="柠檬";
    @Override
    public void clean() {
        System.out.println("柠檬类的clean方法");
    }

}
