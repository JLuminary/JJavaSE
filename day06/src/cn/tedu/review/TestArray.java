package cn.tedu.review;

import java.util.Arrays;

//本类用于复习数组
public class TestArray {
    public static void main(String[] args) {
        System.out.println("早上好~");
        //1.静态方式创建数组
        int[] a={1,2,3,4};
        int[] b=new int[]{1,2,3,4,5,6};
        int[] c=new int[10];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        c[3] = 4;
        c[4] = 5;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println("数组的长度："+a.length);
        System.out.println("数组的长度："+b.length);
        System.out.println("数组的长度："+c.length);
        int[] d=Arrays.copyOf(a,6);
        System.out.println(Arrays.toString(d));
    }
}
