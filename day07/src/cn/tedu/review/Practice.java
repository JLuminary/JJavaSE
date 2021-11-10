package cn.tedu.review;

import java.util.Arrays;

//冒泡排序
public class Practice {
    public static void main(String[] args) {
        int[] a={65,45,61,32,99};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int[] b=Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(b));
        int[] c=new int[10];
        for(int i=0;i<=c.length-1;i++){
            System.out.println();
        }
        for(int i=1;i<=a.length-1;i++){
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
