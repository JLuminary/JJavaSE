package cn.tedu.api;
//本类用于练习String类的使用
public class TestString {
    public static void main(String[] args) {

        //1.创建String对象的方式一
        /*1.字符串类型底层维护的是char[]，存在堆内存中-*/
        char[] values = {'a','b','c'};
        String s2=new String(values);//触发String类的构造函数：String（char[] values）
        String s22=new String(values);//触发String类的构造函数：String（char[] values）
        System.out.println("查看s2："+s2);
        /*此种创建方式不仅写法简单效率还高，字符串存在堆内存的常量池中
        * 效果：如果第一次创建，会正常放入常量池
        * 但第二创建就不会在常量池里新建了，使用的是之前创建好的值*/
        String s3="a,b,c";
        System.out.println("查看s3："+s3);
        String s33="a,b,c";
        System.out.println(s2 == s22);//false,使用方式1 new了两次，是两个对象
        System.out.println(s3 == s33);//true，都指向堆中的常量池中的abc，只有一份
        System.out.println(s2 == s3);//flase 两种创建方式，一个在堆里，一个在常量池

        /*Object中equals（）默认使用==比较地址值
        *但String重写了这个方法，比较的是两个字符串的具体内容
        * 不论创建方式，只要字符串的内容一样，equals（）就返回true*/
        System.out.println(s2.equals(s22));


    }
}
