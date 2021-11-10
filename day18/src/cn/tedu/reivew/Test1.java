package cn.tedu.reivew;
///本类用于单例饿汉式
public class Test1 {
    public static void main(String[] args) {
        Mysing s1 = Mysing.getmysing();
        Mysing s2 = Mysing.getmysing();
        System.out.println(s1==s2);

    }
}
class Mysing{
    private Mysing(){}
    private static Mysing mysing=new Mysing();
    public static Mysing getmysing(){
        return mysing;
    }
}