package cn.tedu.inter;
//本类用于运行测试接口实现类
public class InterTests {
    public static void main(String[] args) {
        /*接口是否可以实例化?--不可以！！*/
        //Inter i=new Inter

        //定义多态对象进行测试--不常用
        Inter i=new InterImpl();
        i.eat();
        i.play();

        //创建纯纯的接口实现类对象进行测试--推荐使用
        InterImpl i1=new InterImpl();
        i1.eat();
        i1.play();
    }
}
