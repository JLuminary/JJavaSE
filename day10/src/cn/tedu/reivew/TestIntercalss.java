package cn.tedu.reivew;
//内部类的入门练习
public class TestIntercalss {
    public static void main(String[] args) {
        J j = new J();
        J.C c = new J().new C();
        j.play();
        c.home();
    }
}
class J {
    String name;
    int age;

    public void play() {
        System.out.println("玩的真开心啊");
        C c=new C();
        c.home();
        System.out.println(c.sum);
    }
    class C{
        int sum=10;
        public void home(){
            System.out.println("包子真好吃");
            System.out.println(name);
            System.out.println(age);
//            play();
        }
    }
}
