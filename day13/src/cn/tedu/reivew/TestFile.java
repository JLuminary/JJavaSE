package cn.tedu.reivew;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//本类用于复写File类中的API
public class TestFile {
    public static void main(String[] args) throws IOException {
        //创建File对象
        File f1 = new File("D:\\ready\\1.txt");
        System.out.println(f1.length());//测试字节长度
        System.out.println(f1.exists());//测试是否存在文档
        System.out.println(f1.isFile());//判断是否是文档
        System.out.println(f1.isDirectory());//判断是否是文件夹
        System.out.println(f1.getName());//或取名字
        System.out.println(f1.getParent());//获取子目录的位置
        System.out.println(f1.getAbsolutePath());//获取文档的绝对位置

        File f2 = new File("D:\\ready\\2.txt");
        System.out.println(f2.createNewFile());//创建新的文档

        System.out.println(f2.delete());//删除文档

        File f3 = new File("D:\\ready\\n");
        System.out.println(f3.mkdir());//创建单个文件夹
        File f4 = new File("D:\\ready\\a\\b\\c\\d\\f");
        System.out.println(f4.mkdirs());//创建多个文件夹

        File f5 = new File("D:\\ready");
        File[] files = f5.listFiles();
        System.out.println(Arrays.toString(files));//获取文档的绝对路径

        File f6 = new File("D:\\ready\\1.txt");
        String[] list = f6.list();
        System.out.println(Arrays.toString(list));//获取文档的子路径
    }
}
