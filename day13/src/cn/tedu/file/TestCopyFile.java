package cn.tedu.file;

import java.io.*;
import java.util.Scanner;

//本类用于练习文件复制综合案例
public class TestCopyFile {
    public static void main(String[] args) {
        //提示并接收用户输入的两个路径
        System.out.println("请输入源文件路径:");//--被复制的那个
        String f=new Scanner(System.in).nextLine();
        System.out.println("请输入新文件路径:");//--复制好的新文件
        String t=new Scanner(System.in).nextLine();

        //2.调用创建好的自定义方法文成文件复制
//        ZFCopy(f,t);//字符流文件的复制
        ZJcopy(f,t);//字节流文件的复制
    }

    private static void ZJcopy(String f, String t) {
        InputStream in = null;
        OutputStream out = null;
        try {
          in = new BufferedInputStream(new FileInputStream(f));
          out = new BufferedOutputStream(new FileOutputStream(t));
          int b;
          while((b=in.read())!=-1){
           out.write(b);
          }
            System.out.println("恭喜您，文件复制成功");
        } catch (Exception e) {
            System.out.println("很抱歉，文件复制失败");
            e.printStackTrace();
        }finally {
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

    private static void ZFCopy(String f, String t) {
        Reader in = null;
        Writer out = null;
        try {
            in=new BufferedReader(new FileReader(f));
            out = new BufferedWriter(new FileWriter(t));
            int b;
            while((b=in.read())!=-1){
                out.write(b);
            }
            System.out.println("恭喜您，文件复制成功");
        } catch (Exception e) {
            System.out.println("很抱歉，文件复制失败");
            e.printStackTrace();
        }finally {
            /*关流是有顺序的，如果有多个流最后创建的流最先关
            * 多条关流语需要各自try-catc*/
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
