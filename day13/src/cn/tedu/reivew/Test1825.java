package cn.tedu.reivew;

import java.io.*;

public class Test1825 {
    public static void main(String[] args) {
        method1();//测试普通字节输入流 inputStream
        method2();//高效字节输入流 BufferedinputStream
        method3();//测试普通字节输出流 outinputStream
        method4();//测试高效字节输出流 BufferedoutinputStream
        method5();//测试高效字符输入流 BufferedReader
        method6();//测试高效字符输出流
    }

    private static void method6() {
        BufferedWriter out = null;
        //创建高效字符输出流
        try {
            out = new BufferedWriter(new FileWriter("D:\\ready\\1.txt"));
            out.write(97);
            out.write(97);
            out.write(97);
            out.write(97);
            out.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method5() {
        BufferedReader in = null;
        //创建高效的字符输入流
        try {
            in = new BufferedReader(new FileReader("D:\\ready\\1.xtt"));
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

    private static void method4() {
        BufferedOutputStream out = null;
        try {
          out = new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt"));
          out.write(98);
          out.write(98);
          out.write(98);
          out.write(98);
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

    private static void method3() {
        OutputStream out = null;
        //创建普通字节输出流
        try {
           out = new FileOutputStream("D:\\ready\\1.txt");
           out.write(97);
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
        BufferedInputStream in = null;
        //创建高效的字节流
        try {
            in = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
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
        FileInputStream in = null;
        //创建普通的字节流
        try {
            in = new FileInputStream("D:\\ready\\1.txt");
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
