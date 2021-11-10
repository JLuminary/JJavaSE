package cn.tedu.reivew;
//复写
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//测试file
public class Test811 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\ready\\1.txt");
        System.out.println(f.length());//获取字节长度
        System.out.println(f.isFile());//判断是否是文档
        System.out.println(f.isDirectory());//判断是否是文件
        System.out.println(f.getName());//获取名字
        System.out.println(f.getParent());//获取当前文档位置
        System.out.println(f.exists());//是否存在当前文档
        System.out.println(f.getAbsolutePath());//获取绝对路径
        File f1 = new File("D:\\ready\\2.txt");
        System.out.println(f1.createNewFile());//创建新的文档
        File f2 = new File("D:\\ready\\n");
        System.out.println(f2.mkdir());//创建新的文件
        File f3 = new File("D:\\ready\\a\\b\\c\\d\\f");
        System.out.println(f3.mkdir());//创建多个新的文件
        System.out.println(f2.delete());//删除文档
        System.out.println(f3.delete());//删除子文件
        File f4 = new File("D:\\ready");
        String[] list = f4.list();//获取位置
        System.out.println(Arrays.toString(list));
        File[] files = f4.listFiles();//获取绝对路径
        System.out.println(Arrays.toString(files));
    }
}
