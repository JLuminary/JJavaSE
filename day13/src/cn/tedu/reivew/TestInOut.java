package cn.tedu.reivew;

import java.io.*;

//本类用于复写 字节高效输入/输出流 字符高效输入输出流
public class TestInOut {
    public static void main(String[] args) {
        method1();//测试高效字节输入流 inputStream
        method2();//测试高效字符输入流 reader
        method3();//测试高效字节输出流 outputStream
        method4();//测试高效字符输出流 Writer
    }

    private static void method4() {
        BufferedWriter out = null;
        //创建高效字符输出流 Wirter
        try {
            out = new BufferedWriter(new FileWriter("D:\\ready\\1.txt"));
            out.write(100);
            out.write(100);
            out.write(100);
            out.write(100);
            out.write(100);
            out.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method3() {
        BufferedOutputStream out = null;
        //创建高效字节输出流
        try {
          out = new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt",true));
          out.write(97);
          out.write(97);
          out.write(97);
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

    private static void method2() {
        BufferedReader in = null;
        //创建高效字符输入流 Reader
        try {
            in = new BufferedReader(new FileReader("D:\\ready\\1.txt"));
            int b;
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
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
        BufferedInputStream in = null;
        try {
            //1.创建字节输入流
          in = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
          //2.使用字节输入流
            int b;
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
