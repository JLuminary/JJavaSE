package cn.tedu.api;
//本类用于测试自动装箱与自动拆箱
public class TestBox {
    public static void main(String[] args) {
        //定义包装类Integer对象
        //回顾：刚刚创建的两种方式
        Integer i1=new Integer(127);
        Integer i11=Integer.valueOf(127);

        //自动装箱
        /*1.自动装箱的现象
        * 编译器会自动把基本类型Int 127，包装成包装类型Inegert
        * 然后交给Integer类型的变量i3来保存，底层发生的代码：Integer.valueOf（127）
        * 自动装箱的方向：int【基本类型】->Integer【刨床类型】*/
        Integer i3=127;

        /*2.自动拆箱的现象
        * 编译器会自动把包装类型i3拆掉箱子变回基本类型的数据127
        * 然后交给基本类型i4来保存，底层发生的代码：i3.intvalue（）
        * 自动拆箱的方向：integer【包装类型】->int【基本类型】*/
        int i4 = i3;


    }
}
