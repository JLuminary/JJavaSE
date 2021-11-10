package cn.tedu.reivew;

public class TestInnerClass2 {
    public static void main(String[] args) {
      new D() {
            @Override
            public void eat() {

            }

            @Override
            public void play() {
                System.out.println("wan");
            }
        }.play();
         new B() {
          @Override
          public void eat1() {
              System.out.println("吃饭");
          }
      }.eat1();
    }
}
interface D{
    void eat();
    void play();
}
abstract class B{
    public void play(){
        System.out.println("玩吧兄弟");
    }
    public abstract void eat1();
}
class C{
    public void eat2(){
        System.out.println("吃了没");
    }
}