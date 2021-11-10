package cn.tedu.reivew;

import java.util.Scanner;

//本类用于复习输入身份证号 测试正则规则
public class Test1900 {
    public static void main(String[] args) {
        //分析定义正则的规则
        String regex="\\d{17}[0-9X]";
        //定义一个接收用户输入的数input
        String input;
        //创建循环
        do{
            System.out.println("请您输入的身份证号：");
            input =new Scanner(System.in).nextLine();
            if(input.matches(regex)){
                System.out.println("恭喜您输入正确");
            }else{
                System.out.println("对不起，您的输入有误");
            }
        }while(!input.matches(regex));


    }
}
