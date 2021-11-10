package cn.tedu.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*本类用于测试字符输入流Reader的读取操作*/
public class TestIn2 {
    public static void main(String[] args) {
        method1();//用于测试普通字符流的读取
        method2();//用于测试高效字符流
    }
    //本方法用于测试高效字符流
    private static void method2() {
        long s=System.currentTimeMillis();
        BufferedReader in=null;
        try {
            //1.创建高效输入字符流对象
            in = new BufferedReader(new FileReader("D:\\ready\\1.txt"));
            //2.使用高效流对象
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
        long end=System.currentTimeMillis();
        System.out.println(end-s);
    }
    //本方法用于测试普通字符流
    private static void method1() {
        long s=System.currentTimeMillis();
        FileReader in = null;
        //1.创建流对象
        try {
            in = new FileReader("D:\\ready\\1.txt");
            //2.使用流对象
            int b;
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //3.关流
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long end=System.currentTimeMillis();
        System.out.println(end-s);
    }
}
