package cn.tedu.reivew;

import java.util.Arrays;

public class Test836 {
    public static void main(String[] args) {
        int[] a={15,29,83,54,5,66};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int[] b=Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(b));
    }
}
