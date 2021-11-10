package cn.tedu.reivew;
//本类用于单例懒汉式测试
public class Test {
    public static void main(String[] args) {
        Mysinglet singlet = Mysinglet.getSinglet();
        Mysinglet singlet1 = Mysinglet.getSinglet();
        System.out.println(singlet==singlet1);
    }
}
class Mysinglet{
    private Mysinglet(){}
    private static Mysinglet singlet;
    public static Mysinglet getSinglet(){
        if(singlet == null){
            singlet=new Mysinglet();
        }
        return singlet;
    }
}