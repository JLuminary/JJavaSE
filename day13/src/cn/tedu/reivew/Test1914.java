package cn.tedu.reivew;

import java.io.*;
import java.util.Scanner;

//复写复制
public class Test1914 {
    public static void main(String[] args) {
        System.out.println("请您输入源路径:");
        String a = new Scanner(System.in).nextLine();
        System.out.println("请您输入新路径:");
        String b = new Scanner(System.in).nextLine();
        method(a, b);//字节 对于照片音频使用
        method1(a, b);//字符
    }

    private static void method1(String a, String b) {
        BufferedReader in = null;
        BufferedWriter out = null;
        //创建
        try {
            in = new BufferedReader(new FileReader(a));
            out = new BufferedWriter(new FileWriter(b));
            //使用
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("恭喜您,复制成功");
        } catch (Exception e) {
            System.out.println("很抱歉,复制失败");
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method(String a, String b) {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(a));
            out = new BufferedOutputStream(new FileOutputStream(b));
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("恭喜您,复制成功");
        } catch (Exception e) {
            System.out.println("很抱歉,复制失败");
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
