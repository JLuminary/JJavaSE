package cn.tedu.innercalss;

public class Test {
    public static void main(String[] args) {
       new A() {
            @Override
            public void eat() {

            }

            @Override
            public void play() {
                System.out.println("woshi");
            }
        }.play();
       new B() {
           @Override
           public void eat1() {
               System.out.println("你是谁");
           }
       }.eat1();
       C c=new C();
       c.eat1();
       c.play1();
    }
}
interface A{
    void eat();
    void play();
}
abstract class B{
    public abstract void eat1();
}
class C{
    public void eat1(){
        System.out.println("HHH");
    }
    public void play1(){
        System.out.println("jjjjj");
    }
}