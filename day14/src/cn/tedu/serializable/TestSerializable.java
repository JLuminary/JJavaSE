package cn.tedu.serializable;

import java.io.*;

//本类用于测试序列化与反序列化
/*序列化：ObjectOutputStream:把Java中的对象，保存在磁盘中，相当于对象信息写出保存在文件中
 * 反序列化：ObjectInputStream:把之前序列化时输出的数据读到内存当中，相当于把对象读取到程序
 * 推荐大家：一次序列化操作对应一次反序列化操作
 * Serializable是一个空接口，里面一个方法都没有
 * 作用是用作标志，标记这个类的对象可以被序列化*/
public class TestSerializable {
    public static void main(String[] args) {
        method1();//测试序列化
        method2();//测试反序列化
    }

    //本方法用于测试反序列化
    private static void method2() {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("D:\\ready\\1.txt"));
            Object o = in.readObject();
            System.out.println(o);
            System.out.println("恭喜你，反序列化成功");
        } catch (Exception e) {
            System.out.println("很抱歉，反序列化失败");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //本方法用于测试序列化
    /*注意：序列化输出的数据我们是看不懂的
    我们需要后期通过反序列化技术把之前的输出的数据重新恢复成对象，才能使用*/
    private static void method1() {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("D:\\ready\\1.txt"));
            //4.指定要序列化输出的对象
            Student opj = new Student("海绵宝宝", 3, "海里", '男');
            out.writeObject(opj);
            System.out.println("恭喜您，序列化成功");
        } catch (IOException e) {
            System.out.println("很抱歉，序列化失败");
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
