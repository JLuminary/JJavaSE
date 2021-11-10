package cn.tedu.file;

import java.io.*;

//本类用于练习字节输出流OutputStream
public class TestOut {
    public static void main(String[] args) {
//        method1();//普通字节输出流
        method2();//高效字节输出流
    }

    private static void method2() {
        BufferedOutputStream out=null;
        try {
            //1.创建高效字节输出流
            out = new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt",true));
            for(int i=1;i<=65535;i++){
                out.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        FileOutputStream out=null;
        try {
            //创建普通字节输出流
           out = new FileOutputStream("D:\\ready\\1.txt",true);

           //2.使用流对象--进行数据的输出操作
            for(int i=1;i<10000;i++) {
                out.write(i);//对应ASCII码表中

            }
        } catch (Exception e) {
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
