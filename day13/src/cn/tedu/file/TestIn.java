package cn.tedu.file;

import java.io.*;

//本类用于练习字节输入流InputStream
public class TestIn {
    public static void main(String[] args) {
//        method();//字节流的读取
        method2();//高效字节流的读取
    }

    private static void method2() {
        //定义一个在本方法中都生效的局部变量，注意手动初始化，引用类型的默认值null
        InputStream in = null;
        try {
            //1.创建流对象
            in = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
           //2.使用流对象
            int b;
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            //3.关流
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //本方法用于测试字节流的读取
    private static void method() {
        //创建一个在本方法中都生效的局部变量,注意手动初始化，引用类型默认值null
        InputStream in = null;
        //1.创建流对象，注意InputStream是抽象类，不可以实例化
        try {
              in=new FileInputStream("D:\\ready\\1.txt");
//            InputStream in=new FileInputStream(new File("D:\\ready\\1.txt"));

            //2.使用流对象：读取指定文件中数据
            /*read方法每次调用都会读取一个字节，如果读到了文件数据的末尾，返回值-1
            * 这个方法的返回值类型是int，所以会查找指定字符对应的编码打印出来*/
//            System.out.println((char) in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());

            //2.2优化代码，使用循环读取文件
            //定义变量保存数据，
            int b;
            //循环读取数据，只要不等于-1，说明还有数据，继续循环
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();//默认写法:打印错误信息
        }finally {
            /*finnlly{}代码块是try-catch结构的第三个部分
            * 这部分不论是否捕获到异常，都一定会执行，所以常用来关流操作*/
            //3.释放资源，流资源用完必须释放
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
