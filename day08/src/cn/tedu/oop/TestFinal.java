package cn.tedu.oop;
//本类用于测试final关键字
public class TestFinal {
}
//定义父类
/*1.final可以用来修饰类，被final修饰的最终类，不可以被继承
* 2.可以把final修饰的类看成数结构的叶子节点
* 测试类被final修饰*/
//final class Father2{
class Father2{
    /*2.final可以用来修饰方法，被final修饰的方法是这个方法的最终实现，不可以被重写*/
    public void work(){
        /*3.被final修饰的值是常量，常量的值不可以被修改
        * 不管在成员位置还是在局部位置，常量定义的时候必须赋值
        * 注意：常量的名称必须是全大写，单词与单词之间使用_分割*/
        int a=10;
        a=100;
        final int b=20;
//        b=30;
        System.out.println("工厂里上班~");
    }
}
//定义子类
class Son2 extends Father2{
    final int c=10;
    //重写父类方法
    @Override//这个注解用来标记这是一个重写的方法
    public void work(){
        System.out.println("坐办公室上班~");
    }
}