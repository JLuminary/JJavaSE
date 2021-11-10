package cn.tedu.reivew;

import java.util.Scanner;

//验证手机号的方法
public class Test1943 {
    public static void main(String[] args) {
        //手机号11位
        String regex="\\d{11}";
        String input;
        do{
            System.out.println("请您输入手机号:");
            input=new Scanner(System.in).nextLine();
            if(input.matches(regex)){
                System.out.println("恭喜你输入正确");
            }else{
                System.out.println("对不起，您的输入有误");
            }
        }while(!input.matches(regex));
    }
}
