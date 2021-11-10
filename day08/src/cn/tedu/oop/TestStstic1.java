package cn.tedu.oop;
//本类用于静态static的入门案例
public class TestStstic1 {
    public static void main(String[] args) {
        Fruite f=new Fruite();
        Fruite f1=new Fruite();
        Fruite.kind="苹果";
        System.out.println(Fruite.kind);
        System.out.println(f.kind);
        System.out.println(f1.kind);

        f.kind="香蕉";
        System.out.println(Fruite.kind);
        System.out.println(f.kind);
        System.out.println(f1.kind);
        f.grow();
        f.clean();//没有提示需要自己写
        Fruite.clean();//被static修饰的可以通过类名直接调用静态方法，而且这个IDEA会提示
        f.weight=10.3;
        System.out.println(f.weight);
        System.out.println(Fruite.kind);
    }
}
/*0.被static修饰的资源统称为静态资源
* 静态资源是随着类加载到内存中的，比对象优先进入内存
* 所有静态资源可以通过类名直接调用，即使没有创建对象，也可以调用
* 静态资源在内存中只有一份，而且被全局所有对象所共享
* 所以：当我们通过任意一种方式修改了静态变量的值以后
* 不管用什么方式查看，静态变量的值都是刚刚修改过后的值*/
//创建水果类
class Fruite{
    //2.定义属性
    /*可以用static修饰属性*/
    static String kind;
    double weight;
    String name;

    /*可以用static修饰方法*/
    //创建普通方法
    public static void clean(){
        System.out.println("洗水果呀洗水果~");
    }
    public void grow(){
        System.out.println("这个果子长得一看就很好吃~");
    }
}