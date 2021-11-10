package cn.tedu.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 1, 20, 19, 30, 5};
        int a = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[a] < arr[i]) {
                a = i;
            }
        }
        System.out.println("下标值为：" + a + "最大值为：" + arr[a]);

    }
}
