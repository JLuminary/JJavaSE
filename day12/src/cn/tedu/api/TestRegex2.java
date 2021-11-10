package cn.tedu.api;

import java.util.Scanner;

//本类用于复写身份证验证案例
public class TestRegex2 {
    public static void main(String[] args) {
        //1.定义正则表达式
        String regex="[0-9]{17}[0-9X]";
        /*单个\在Java中有特殊的含义，表示转义符号，不认为这是一个单纯的斜杠
        * 所以，如果想要单纯的表示一个\，需要在他的前面再加上一个\用来转义
        * 也就是\\才表示单个的\*/
//        String regex1="\\d{17}[0-9X]";
        String input;
        do{
            System.out.println("请您输入您的身份证号：");
            input = new Scanner(System.in).nextLine();
            if(input.matches(regex)){
                System.out.println("恭喜你！输入正确");
            }else{
                System.out.println("输入错误");
            }
        }while(!input.matches(regex));
    }
}
