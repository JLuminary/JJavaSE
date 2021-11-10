package cn.tedu.basic;

import java.util.Arrays;

/*本类用于复习数组的相关知识*/
public class TestArray1 {
    public static void main(String[] args) {
        f1();//求出数组中元素的和
        f2();//求出数组中元素的最大值
        f3();

    }

    private static void f3() {
        int[] a = {5, 65, 4, 3, 45};
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 0; j <a.length-i; j++) {
                if (a[j]<a[j + 1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
            System.out.println("第"+i+"轮"+Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }

    private static void f2() {
        int[] a = {5, 65, 4, 3, 45};
        int max = a[0];
        for (int j = 1; j < a.length - 1; j++) {
            if (a[j] > max) {
                max = a[j];
            }
        }
        System.out.println(max);
    }

    private static void f1() {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("所有元素的和为：" + sum);
    }
}
