package cn.tedu.reivew;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//本类用于复习File IO流
public class Test1905 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\ready\\1.txt");
        System.out.println(f.length());//长度 26
        System.out.println(f.isFile());//是否是一个file  返回值都是boolean  true
        System.out.println(f.isDirectory());//是否是一个文件夹 返回值都是boolean false
        System.out.println(f.exists());//判断是否存在此file true
        System.out.println(f.getName());//获取file的名字 1.txt
        System.out.println(f.getParent());//获取file的位置 D：
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());
        System.out.println("-------------");
        File f1 = new File("D:\\ready\\2.txt");//创建新的文本文档
        System.out.println(f1.createNewFile());
        File f2 = new File("D:\\ready\\n");
        System.out.println(f2.mkdirs());//创建单个文件夹
        File f3 = new File("D:\\ready\\a\\b\\c");
        System.out.println(f3.mkdirs());//创建多个文件夹
        System.out.println(f3.delete());//删除最外层的文件夹
        System.out.println(f1.delete());//直接删除文本文档
        File f4 = new File("D:\\ready");
        String[] list = f4.list();
        System.out.println(Arrays.toString(list));//[1.txt, a, n]
        File[] files = f4.listFiles();
        System.out.println(Arrays.toString(files));//[D:\ready\1.txt, D:\ready\a, D:\ready\n]
    }

}
