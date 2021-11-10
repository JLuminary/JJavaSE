package cn.tedu.inter;
/*本接口用于创建接口测试*/
/*1.首先我们通过interface来定义接口*/
public interface Inter {
    /*2.接口中可以定义普通方法吗？--不可以*/
    //public void play(){}
    /*4.接口中可以定义抽象方法吗？--可以，接口中方法都是抽象方法*/
    public abstract void play();
    public abstract void eat();
}
