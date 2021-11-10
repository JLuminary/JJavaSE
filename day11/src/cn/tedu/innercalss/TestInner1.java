package cn.tedu.innercalss;
//本类用于复写内部入门案例
public class TestInner1 {
    public static void main(String[] args) {
        //3.在main方法里创建内部类对象，使用Alt+enter，使用内部类资源
//

        Outor o = new Outor();
        o.find();
    }
}
class Outor{
    //创建外部类的成员变量
    String name;
    private int age;
    public void find(){
        System.out.println("玩的开心呦");
        inner i=new inner();
        i.play();
    }
    /*根据内部类的位置的不同：分为
     * 成员内部类：类里方法外
     * 局部内部类：方法里*/
    //创建成员内部类 --可以看做外部类的一个特殊成员
        class inner{
            int sum=10;
        public void play(){
            System.out.println(name);
            System.out.println(age);
//                find();
        }
    }
}

