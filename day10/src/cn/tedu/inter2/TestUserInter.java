package cn.tedu.inter2;
//本类用于进一步测试接口类的使用
public class TestUserInter {
    public static void main(String[] args) {
        UserInterImpl u=new UserInterImpl();
        u.eat();
//        UserInter.a=30;//final，因为值不可以被修改
        System.out.println(UserInter.a);//静态，因为可以被接口名直接调用
    }
}
interface UserInter{
    //2.测试接口中是否能含有构造方法
//    public UserInter(){}
    public abstract void eat();
    /*接口里没有构造方法*/
    /*静态的常量 实际写法是 public static final int age = 20；
     * 只不过接口中可以省略不写，会默认拼接，所以写成 int age = 20;*/
    public static final int a=10;

    //接口里抽象方法吗？--
    /*接口中抽象方法的定义也可以简写，会自动给方法拼接public abstract */
    public abstract void eat1();
    void play();
}
class UserInterImpl implements UserInter{
    //构造实现类的构造方法
    public UserInterImpl(){
        /*2.如果一个类没有明确指定父类，那么它默认继承顶级父类object*/
        super();/*此处调用的父类的无参构造是object的无参构造*/
        System.out.println("我是子实现类的无参构造");
    }
    @Override
    public void eat() {
        System.out.println("我是测试类哈哈哈啊哈哈哈哈哈哈哈哈啊大家好我是你大爷六六六");
    }

    @Override
    public void eat1() {
        System.out.println("我是一个吃的第二个方法");
    }

    @Override
    public void play() {
        System.out.println("我是玩法");
    }
}