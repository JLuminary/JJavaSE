package cn.tedu.inter;
/*本类作为Inter接口的实现类*/
/*实现类如果想要实现接口定义的功能，需要与接口建立实现关系
* 通过关键字implements来建立实现类 实现 接口的关系*/
/*2.方案一：如果实现类与接口类建立实现关系以后
* 可以选择不实现接口中的抽象方法，把自己变成一个抽象类*/
/*2.2方案二：如果实现类与接口建立实现关系以后
* 还可以选择实现接口中的所有抽象方法，把自己变成一个普通方法*/
public class InterImpl implements Inter{
    @Override
    public void play() {
        System.out.println("我就喜欢玩");
    }

    @Override
    public void eat() {
        System.out.println("搁劲吃");
    }
}
