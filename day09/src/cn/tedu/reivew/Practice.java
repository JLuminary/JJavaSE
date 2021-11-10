package cn.tedu.reivew;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("请您输入第一个数：");
        int a=new Scanner(System.in).nextInt();
        System.out.println("请您输入第二个数：");
        int b=new Scanner(System.in).nextInt();
        int max=a>b?a:b;
        int min=a<b?a:b;
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);

        for(int i=9;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
        System.out.println();
//        int[] arr={95,45,56,2,16,56,88};
//        for(int i=1;i<=arr.length-1;i++){//控制轮数
//            for(int j=0;j<arr.length-i;j++){
//                if (arr[j]>arr[j+1]){
//                    int t=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=t;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<=arr.length-1;i++){
//            System.out.print(arr[i]+" ");
//        }
        int[] arr1={9,62,85,31,23,5,2,7};
        for(int i=1;i<=arr1.length-1;i++){//控制轮数
            for(int j=0;j<arr1.length-i;j++){
                if (arr1[j]<arr1[j+1]){
                    int t=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<=arr1.length-1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
