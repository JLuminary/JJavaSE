package cn.tedu.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//本类用于测试文件夹File
public class TestFile {
    public static void main(String[] args) throws IOException {
        //1.创建file类的对象
        /*1.raedy文件夹与1.txt需要自己手动创建
        * 2.File需要导包：import java.io.File
        * 3.路径pathname是String类型的数据，必须写正确，不然找不到文件报错
        * 4.完整的文件夹包含两部分：文件名+后缀名
        * */
        File file=new File("D:\\ready\\1.txt");
        //2.1测试File类中的常用方法
        System.out.println(file.length());//文件里数据是abc，长度为3
        System.out.println(file.isDirectory());//false,判断当前file对象是否是文件夹
        System.out.println(file.isFile());//true,判断file对象是否是文件
        System.out.println(file.getName());//1.txt
        System.out.println(file.getParent());//D:\ready
        System.out.println(file.getAbsoluteFile());//D:\raedy\1.t 获取带盘符的绝对路径
        System.out.println(file.exists());//true,判断当前file对象指定的路径是否存在

        //2.测试file的创建与删除
        /*new只会帮我们在内存中帮我们创建file类型的对象
        * 并不会帮我们在磁盘对应的路径下创建一个真实存在的2.txt文件*/
        File file2 =new File("D:\\ready\\2.txt");

        //创建一个之前不存在的2.txt，如果创建成功会返回true
        /*如果创建的文件位置不对，会抛出异常：IOException
        * 所以需要提前处理这个问题
        * 这个IO异常是我们目前遇到的强制要求必须预先处理的异常
        * 如果不处理，方法调用会报错，通不过编译*/
        System.out.println(file2.createNewFile());

        //创建当前不存在的文件夹
        File file3=new File("D:\\ready\\n");
        System.out.println(file3.mkdir());

        file3 =new File("D:\\ready\\a\\b\\c");
        System.out.println(file3.mkdirs());

        /*delete（）只能删除文件或者空的文件夹*/
        System.out.println(file2.delete());//2.txt被删除
        System.out.println(file3.delete());//最里层的c被删除

        //2.3展示文件
        //调用的都是Stirng对象 的方法
        File file4=new File("D:\\ready");
        String[] list = file4.list();
        System.out.println(Arrays.toString(list));//[1.txt, a, n]

        //测试文件夹常用 直接可以调用file对象
        File[] files = file4.listFiles();
        System.out.println(Arrays.toString(files));//[D:\ready\1.txt, D:\ready\a, D:\ready\n]

    }
}
