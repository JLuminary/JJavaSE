package cn.tedu.test;

/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 *
 * @author Xiloer
 */

public class TestDay0102 {
    public static void main(String[] args) {
        String s = "大家好!";
        String s1 = s.concat("我是程序员!");
        System.out.println(s1);
        StringBuffer sb = new StringBuffer(s1);
        StringBuffer s2 = sb.insert(6, "优秀的");
        System.out.println(s2);
        StringBuffer s3=sb.replace(6,8,"牛牛");
        System.out.println(s3);
        System.out.println(s3.substring(4));
    }
}
