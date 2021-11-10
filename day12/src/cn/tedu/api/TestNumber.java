package cn.tedu.api;
//本类用于测试包装类
public class TestNumber {
    //定义成员变量注意要设置静态的，因为静态只能调用静态的
    static Integer i0;
    public static void main(String[] args) {
        //引用类型的默认值都是null
        System.out.println(i0);//null

        //3.1创建int类型对应的包装类型Integer对象
        Integer i1 = new Integer(1);
        Integer i11 = new Integer(1);
        System.out.println(i1 == i11);//包装类的创建方式一

        //3.2创建int类型对应的包装类Integer对象
        /*Integer对象创建方式二有一个高效的效果，但是要求
        * 1.是Integer类型
        * 2.使用valueOf（）的创建方式
        * 3.数据在-128-127范围之内
        * 只有满足以上3个条件，相同的数据只会存一次，后续再存都是使用之前创建好的数据*/
        Integer i2 = Integer.valueOf(127);
        Integer i22 = Integer.valueOf(127);
        System.out.println(i2);
        System.out.println(i1 == i2);//false
        System.out.println(i2 == i22);//true

        //4.创建Double的包装类
        Double d1=new Double(3.14);
        Double d11=new Double(3.14);
        System.out.println(d1 == d11);//false

        /*只有Integer才有高效的效果，Double是没有的*/
        Double d2=Double.valueOf(3.14);
        Double d22=Double.valueOf(3.14);
        System.out.println(d1 == d2);//false
        System.out.println(d2 == d22);//fasle

        //String类型的数据为int类型的数据
        System.out.println(i1.parseInt("800")+10);//810
        //把String类型的数据转为double类型的数据
        System.out.println(d1.parseDouble("2.2")+3.3);//5.5
    }
}
