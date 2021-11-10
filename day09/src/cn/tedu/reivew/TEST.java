package cn.tedu.reivew;

import java.util.Arrays;

public class TEST {
    public static void main(String[] args) {
   int[] a={35,14,2,65,97,25};
        for(int i=1;i<=a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int t  = a[j];
                    a[j]   = a[j+1];
                    a[j+1] = t;
                }
            }
       }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
