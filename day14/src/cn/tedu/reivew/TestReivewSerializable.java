package cn.tedu.reivew;

import java.io.*;

public class TestReivewSerializable {
    public static void main(String[] args) {

    method1();//序列化
    method2();//反序列化
}

    private static void method2() {
        ObjectInputStream in =null;
        try {
            in=new ObjectInputStream(new FileInputStream("D:\\ready\\1.txt"));
//            Object o = in.readObject();
//            System.out.println(o);
            System.out.println("恭喜您！反序列化成功");
        } catch (IOException e) {
            System.out.println("抱歉！反序列化失败");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        //创建序列化对象
        ObjectOutputStream out = null;
        try {
            out= new ObjectOutputStream(new FileOutputStream("D:\\ready\\1.txt"));
//         Student obj=new Student(")
//            out.writeObject(obj);
            System.out.println("恭喜您！序列化成功");
        } catch (IOException e) {
            System.out.println("抱歉！序列化失败");
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}