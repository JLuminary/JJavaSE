package cn.tedu.reivew;
//本类用于复习方法的重写
//重写的原则 ：两同 一大 两小
public class TestExtends {
    public static void main(String[] args) {
        Father f= new Father();
        Son s=new Son();
        //测试重写的方法
        f.eat();
        s.eat();
        f.sleep(8);
        s.sleep(10);
        f.play();
        System.out.println(f.play());
        s.play();
        f.getPet();
        Ainmal a2=f.getPet();
        System.out.println(a2.name);
        Dog d= s.getPet();
        System.out.println(d.name);

    }
}
//创建父类
class Father {
    static{
        System.out.println("我是静态代码块");
    }
    public void eat() {
        System.out.println("爸爸爱吃黑猪肉");
    }

    public void sleep(int n) {
        System.out.println("爸爸晚上睡了" + n + "小时");
    }

    public int play() {
        System.out.println("爸爸在玩");
        return 666;
    }

    public Ainmal getPet() {
        Ainmal a = new Ainmal();
        return a;
    }
}
    //创建子类
    class Son extends Father {
        @Override
        public void eat() {
            System.out.println("儿子喜欢吃青菜");
        }

        public void sleep(int n) {
            System.out.println("儿子晚上睡了" + n + "小时");
        }

        public int play() {
            System.out.println("儿子在打游戏");
            return 999;
        }

//    public Ainmal getPet() {
//        Ainmal a = new Ainmal();
//        return a;
//    }

        public Dog getPet() {
            Dog d = new Dog();
            return d;
        }
    }
//8.1准备两个辅助测试类
class Ainmal{
    String name="啥动物都行";
}
class Dog extends Ainmal{
    String name ="小狗";
}
class Car{

}
