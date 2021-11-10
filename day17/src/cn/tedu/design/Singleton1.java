package cn.tedu.design;

/*本类用于实现单例设计模式方案1：饿汉式*/
public class Singleton1 {
    public static void main(String[] args) {
        MySingle single1 = MySingle.getSingle();
        MySingle single2 = MySingle.getSingle();

        //6.用==检验是否是同一对象
        System.out.println(single1 == single2);
    }
}

//创建自己的单例程序
class MySingle {
    //1.提供本类的构造方法，并将构造方法私有化
    /*1.构造方法私有化的目的：为了防止外界随意实例化本类对象*/
    private MySingle() {
        System.out.println("我是无参构造");
    }

    //2.创建本类对象，并将对象也私有化
    private static MySingle single = new MySingle();

    //3.提供公共的访问方法，向外界返回创建好的对象
    public static MySingle getSingle() {
        return single;
    }
}
