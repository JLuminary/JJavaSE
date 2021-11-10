package cn.tedu.inter;

public class TestInter {
    public static void main(String[] args) {
        Inter1impl i=new Inter1impl();
        i.play();
    }
}
interface Inter1{
    public abstract void play();
}
class Inter1impl implements Inter1{

    @Override
    public void play() {
        System.out.println("我是测试");
    }
}