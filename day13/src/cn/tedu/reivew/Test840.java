package cn.tedu.reivew;

import java.util.Scanner;

//复写身份证
public class Test840 {
    public static void main(String[] args) {
        //定义正则表达
        String regex="\\d{17}[0-9X]";
        String input;
        do{
            System.out.println("请您输入身份证号:");
            input=new Scanner(System.in).nextLine();
            if(input.matches(regex)){
                System.out.println("恭喜您，输入正确");
            }else{
                System.out.println("对不起，输入有误");
            }
        }while(!input.matches(regex));
    }
}
