package cn.tedu.reivew;
//复习包装类的作用
public class Test1840 {
    public static void main(String[] args) {
        //创建包装类
        Integer i=new Integer(127);
        Integer i1=Integer.valueOf(127);
        Integer i11=Integer.valueOf(127);
        Double d=new Double(3.14);
        Double d1=Double.valueOf(3.14);
        Double d11=Double.valueOf(3.14);
        System.out.println(i == i1);//false
        System.out.println(i1 == i11);//true
        System.out.println(d == d1);//false
        System.out.println(d1 == d11);//false
        Integer i3=127;//自动装箱
        int i2=i1;//自动拆箱
    }

}
