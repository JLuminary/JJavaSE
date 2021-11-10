package cn.tedu.reivew;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//本类用于复写字节流对象
public class TestInReivew {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {
        BufferedInputStream in=null;
        //1.创建高效字节流对象
        try {
            in = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
            //2.使用高效流
            int b;
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //3.关流
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        FileInputStream in=null;
        //1.创建普通字节流对象
        try {
            in = new FileInputStream("D:\\ready\\1.txt");
            //2.使用字节流对象
            int b;
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //3.关流
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
