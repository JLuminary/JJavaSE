package cn.tedu.file;

import java.io.*;

//本类用于字符输出流Witer
public class TetsOut2 {
    public static void main(String[] args) {
//        method1();//测试普通字符输出流
        method2();//测试高效字符输出流
    }

    private static void method2() {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("D:\\ready\\1.txt", true));
            out.write(100);
            out.write(100);
            out.write(100);
            out.write(100);
            out.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        FileWriter out = null;
        try {
            out = new FileWriter("D:\\ready\\1.txt", true);
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
    }
}
