package cn.tedu.review;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i=0;i<=a.length-1;i++){
            a[i]=new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        int[] b=Arrays.copyOf(a,5);
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println("请输入一个数：");
        int c =new Scanner(System.in).nextInt();
    }
}
