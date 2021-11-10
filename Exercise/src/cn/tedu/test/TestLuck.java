package cn.tedu.test;

/* 双色球模拟案例 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestLuck {
    public static void main(String[] args) {
        //随机生成 一个数组
        int[] luckNumbers = creatLuckNumber();
        //用户输入的数组
        int[] userNumbers = userInputNumber();

        //判断中奖情况
        judge(luckNumbers, userNumbers);

    }

    public static void judge(int[] luckNumbers, int[] userNumbers) {
        int readHitNumbers = 0;
        int blueHitNumbers = 0;

        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                if (userNumbers[i] == luckNumbers[j]) {
                    readHitNumbers++;
                    break;
                }
            }
        }
        blueHitNumbers = luckNumbers[6] == userNumbers[6] ? 1 : 0;

        System.out.println("中奖号码是");
        ptintArray(luckNumbers);
        System.out.println("您的投注号码是");
        ptintArray(userNumbers);
        System.out.println("您命中了几个红球"+readHitNumbers);
        System.out.println("您是否命中蓝球"+(blueHitNumbers ==1?"是":"否"));
        if (blueHitNumbers == 1 && readHitNumbers < 3) {
            System.out.println("恭喜您，中了六等奖，奖金5元");
        }else if(blueHitNumbers ==1&&readHitNumbers==2||blueHitNumbers ==1&&readHitNumbers==3||blueHitNumbers==0&&readHitNumbers==4){
            System.out.println("恭喜您，中了五等奖，奖金10元");
        }else if(blueHitNumbers ==1&&readHitNumbers==4||blueHitNumbers==0&&readHitNumbers==5){
            System.out.println("恭喜您，中了四等奖，奖金200元");
        }else if(blueHitNumbers ==1&&readHitNumbers==5){
            System.out.println("恭喜您，中了三等奖，奖金3000元");
        }else if(blueHitNumbers ==0&&readHitNumbers==6){
            System.out.println("恭喜您，中了二等奖，奖金5000000元");
        }else if(blueHitNumbers ==1&&readHitNumbers==6){
            System.out.println("恭喜您，中了一等奖，奖金10000000元");
        }else {
            System.out.println("很遗憾，您未中奖");
        }
    }

    public static void ptintArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int[] userInputNumber() {
        //定义一个数组长度为7
        int[] numbers = new int[7];
        //让用户输入6个红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请您输入第" + (i + 1) + "个红球号码（1-33）要求不重复）");
            int data = sc.nextInt();
            numbers[i] = data;
        }
        System.out.println("请您输入蓝球号码（1-16）：");
        numbers[6] = sc.nextInt();
        return numbers;
    }

    public static int[] creatLuckNumber() {
        //定义一个初始化的数组，存储7个数字
        int[] numbers = new int[7];
        //遍历数组，为每个位置生成对应的号码 注意：遍历生成前6个位置，生成6个不重复的额红球号码1-35
        Random r = new Random();//生成随机数对象
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                int data = r.nextInt(33) + 1;//范围是1-33===>(0-32)+1
                //注意：必须判断当前随机的这个号码是否出现过，出现过
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == data) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    numbers[i] = data;
                    break;
                }
            }
        }
        //为第7个位置生成一个蓝球号码1-16
        numbers[6] = r.nextInt(16) + 1;
        return numbers;
    }
}

