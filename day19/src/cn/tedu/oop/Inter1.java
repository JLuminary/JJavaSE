package cn.tedu.oop;

public interface Inter1 {
    public default void play(){
        System.out.println("我是接口中的默认方法，我有方法体");
    }
}
class Inter1Iml implements Inter1{
    @Override
    public void play(){
        System.out.println("我是接口中的实现类，重写了接口默认方法");
    }
}