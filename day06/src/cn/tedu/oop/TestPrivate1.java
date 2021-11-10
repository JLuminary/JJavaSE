package cn.tedu.oop;
//本类用于测试封装的必要性
public class TestPrivate1 {
    public static void main(String[] args) {
        User u =new User();
        u.name="葫芦娃";
        System.out.println(u.name);
//        u.money=100000000;
//        System.out.println(u.money);
//            u.getMoney();
        //6.调用查看余额的方法，获取money的方法，并打印在控制台
        System.out.println(u.getMoney());
        u.setMoney(999999.321);
        System.out.println(u.getMoney());
    }
}
//1.创建一个类
class User{
    //2.定义用户类的属性
    public String name;//姓名
    //4.为了安全操作余额，修改money修饰符
    /*被private修饰的资源只能在本类使用*/
    private double money=10000;//账户余额
    //5.1提供公共的方法供外界调用,方法的功能：获取余额
    public double getMoney(){
        /*如果方法的返回值类型不是viod
        * 就需要使用return关键字返回对应类型的返回值*/
        /*后续可以增加权限的校验*/
        return money;
    }
    //5.2提供公共的方法供外界调用,方法的功能：更改余额
    public void setMoney(double newMoney) {
        /*后续可以添加权限校验*/
        money =newMoney;
    }
}