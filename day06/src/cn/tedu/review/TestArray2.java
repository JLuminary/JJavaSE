package cn.tedu.review;

import java.util.Arrays;

public class TestArray2 {
    public static void main(String[] args) {
        //.0.定义一个用来复制的原数组
        int[] from ={1,2,3,4};
        //1.数组的普通复制
        int[] to= Arrays.copyOf(from,4);
        System.out.println(Arrays.toString(to));
        //2.数组的扩容
        int[] to1=Arrays.copyOf(from,10);
        System.out.println(Arrays.toString(to1));
        //3.数组的缩容
        int[] to2=Arrays.copyOf(from,2);
        System.out.println(Arrays.toString(to2));
        System.out.println(Arrays.toString(from));
    }
}
