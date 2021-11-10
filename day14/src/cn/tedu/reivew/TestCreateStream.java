package cn.tedu.reivew;

import java.io.*;

//本类用于 复习流创建
public class TestCreateStream {
    public static void main(String[] args) {
        /*1.创建流对象
         * 2.使用流对象
         * 3.关闭流对象*/
        f1();//字节流对象创建
        f2();//字符流对象创建
    }

    //用于复习字符流对象的创建
    private static void f2() {
        FileReader in = null;
        //用于复习字符输入流
        try {
            in = new FileReader("D:\\ready\\1.txt");
            int b;
            if ((b = in.read()) != -1) {
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //用于复习高效的字符输出流
        BufferedReader in1 = null;
        try {
            in1 = new BufferedReader(new FileReader("D:\\ready\\1.txt"));
            int b1;
            if ((b1 = in1.read()) != -1) {
                System.out.println(b1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //用于复习字符输出流
        FileWriter out = null;
        try {
            out = new FileWriter("D:\\ready\\1.txt", true);
            out.write(97);
            out.write(97);
            out.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //复习高效字符输出流
        BufferedWriter out1 = null;
        try {
            out1 = new BufferedWriter(new FileWriter("D:\\ready\\1.txt", true));
            out.write(98);
            out.write(98);
            out.write(98);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //用于复习字节流对象的创建
    private static void f1() {
        FileInputStream in = null;
        //用于复习字节输入流
        try {
            in = new FileInputStream("D:\\ready\\1.txt");
            int b;
            if ((b = in.read()) != -1) {
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //用于复习高效字节输入流
        BufferedInputStream in1 = null;
        try {
            in1 = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txtx"));
            int b1;
            if ((b1 = in1.read()) != -1) {
                System.out.println(b1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //用于复习字节输出流
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("D:\\ready\\1.txt", true);
            out.write(97);
            out.write(97);
            out.write(97);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //用于复习高效字节输出流
        BufferedOutputStream out1 = null;
        try {
            out1 = new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt", true));
            out1.write(98);
            out1.write(99);
            out1.write(100);
            out1.write(101);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
