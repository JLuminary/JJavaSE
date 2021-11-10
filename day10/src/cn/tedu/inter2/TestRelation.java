package cn.tedu.inter2;
//本类用于测试接口与类之间的复杂关系
public class TestRelation {
    public static void main(String[] args) {
//       Inter3 i=new Inter3impl();
//        i.save();
//        i.delete();
//        i.update();
//        i.find();
    }

}
//1.创建接口1与接口中国的抽象方法1
interface Inter1{
    void save();//保存功能--增
    void delete();//删除功能--删

}
//2.创建接口2与接口中的抽象方法2
interface Inter2{
    void update();//更新功能--改
    void find();//查询功能--查
}
//3.创建接口3 同时继承接口1 与 接口2
/*接口可以继承接口，而且还可以多继承，也就是一个子接口继承多个父接口
* 多个接口之间使用逗号分隔*/
interface Inter3 extends Inter1,Inter2{
}
//class Inter3impl implements Inter3{
/*实现类与接口是实现的关系，并且实现类可以实现多个接口，接口之间用逗号隔开
* 对于Java中的类而言：遵循：单继承，多实现的规则
* 对于Java中的接口而言，遵循：既可以单继承，也可以多继承*/
class Inter3impl implements Inter1,Inter2{

    @Override
    public void save() {
        System.out.println("是增");
    }

    @Override
    public void delete() {
        System.out.println("是删");
    }

    @Override
    public void update() {
        System.out.println("是改");
    }

    @Override
    public void find() {
        System.out.println("是查");
    }
}
