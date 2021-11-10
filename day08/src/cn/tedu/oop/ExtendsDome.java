package cn.tedu.oop;
//本类用于测试继承中方法的使用
public class ExtendsDome {
    public static void main(String[] args) {
        Father f=new Father();
        Son s=new Son();
        f.eat();
        s.eat();
        f.play();
        s.play();
    }
}
//创建一个父类方法
class Father{
    public void eat(){
        System.out.println("爸爸爱吃黑猪肉");
    }
    public void play(){
        System.out.println("爸爸爱散步");
    }
}
class Son extends Father {
    /*重写方法的原则：两同 一大 两小
     * 两同：子类方法的 方法名与参数列表必须和父类的相同
     * 一大：子类方法的 修饰符类型必须>=父类方法的修饰符
     * 两小：子类方法的返回值类型必须<=父类方法的返回值类型
     * 注意：这里的返回值类型是指子类返回值类型是父类返回值类型的子类
     * 或者与父类的返回值类型一致，如果父类方法的返回值类型是void，子类保持一致即可
     * */
    @Override //注解，用来加在方法上 标识这是一个重写的方法
    public void eat() {
        System.out.println("我喜欢吃青菜");
    }

    @Override
    public void play() {
        System.out.println("儿子爱玩游戏");
    }
}