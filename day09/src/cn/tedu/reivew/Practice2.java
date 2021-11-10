package cn.tedu.reivew;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
//        try {
//            System.out.println("请您输入第一个数：");
//            int a = new Scanner(System.in).nextInt();
//            System.out.println("请您输入第二个数：");
//            int b = new Scanner(System.in).nextInt();
//            int max=a>b?a:b;
//            int min=a<b?a:b;
//            System.out.println("最大值为："+max);
//            System.out.println("最小值为："+min);
//        }catch(Exception e){
//            System.out.println("请您重新输入，谢谢");
//        }
////        method();
//        Jcm();
//    }
//
//    private static void Jcm() {
//        try {
//            method();
//        }catch(Exception e){
//            System.out.println("请重新输入谢谢");
//        }
//    }
//
//    private static void method()throws Exception{
//        System.out.println("请您输入第一个数：");
//        int a = new Scanner(System.in).nextInt();
//        System.out.println("请您输入第二个数：");
//        int b = new Scanner(System.in).nextInt();
//        int max=a>b?a:b;
//        int min=a<b?a:b;
//        System.out.println("最大值为："+max);
//        System.out.println("最小值为："+min);
        int r=new Random().nextInt(10);
        while(true) {
            System.out.println("猜猜看:");
            int input=new Scanner(System.in).nextInt();
            if (r > input) {
                System.out.println("猜大了，继续猜");
            } else if (r < input) {
                System.out.println("猜小了，继续猜");
            } else if (r == input) {
                System.out.println("恭喜您，猜对了");
                break;
            }
        }
    }
}
