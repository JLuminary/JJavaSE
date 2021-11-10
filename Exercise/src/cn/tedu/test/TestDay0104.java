package cn.tedu.test;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Xiloer
 *
 */
public class TestDay0104 {
    public static void main(String[] args) {
        String regex="[0-9a-zA-Z]*[@][0-9a-zA-Z]*[.][c][o][m]";
        String input;

        do{
            System.out.println("请输入您的邮箱:");
            input =new Scanner(System.in).nextLine();
            if(input.matches(regex)){
                System.out.println("您的邮箱输入正确");
            }else{
                System.out.println("你的邮箱输入有误");
            }
        }while(!input.matches(regex));

        int i=input.indexOf("@");
        System.out.println("您的用户名为:"+input.substring(0,i));

    }
}
