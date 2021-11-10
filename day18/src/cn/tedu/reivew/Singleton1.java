package cn.tedu.reivew;
/*本类用于复写单例设计模式--饿汉式实现模式*/
public class Singleton1 {
    public static void main(String[] args) {
        MySingle single = MySingle.getSingle();
        MySingle single1 = MySingle.getSingle();
        System.out.println(single==single1);
        System.out.println(single);
        System.out.println(single1);
    }
}
//0.创建自己的单例类
class MySingle{
    //1.提供本类的无参构造
    private MySingle(){}
    //2.提供本类的对象，并且设置成私有的
    private static MySingle single=new MySingle();
    //3.提供公共的方法，返回创建好的对象
    public static MySingle getSingle(){
        return single;

    }
}