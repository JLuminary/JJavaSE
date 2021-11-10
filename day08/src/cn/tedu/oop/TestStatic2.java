package cn.tedu.oop;
//本类用于测试静态的测试关系
/*总结：
*1.普通资源既可以调用又可以调用静态资源
* 2.静态资源只能调用静态资源*/
public class TestStatic2 {
    public static void main(String[] args) {
        Teather.ready();
        Teather.id=2;
        System.out.println(Teather.id);
        Teather.eat();

    }
}

class Teather{
    //定义属性
    String name;//姓名
    //定义静态资源
    static int id;
    //定义方法
    /*普通资源可以调用静态资源*/
    public void teach(){
        System.out.println("授课ing~~");
        ready();
    }
    /*静态资源能不能调用普通资源*/
    public static void ready(){
        System.out.println("备课ing~~");
//        System.out.println(name);
//        teach();
    }
    public static void eat(){
        System.out.println(id);
        ready();
    }
}
