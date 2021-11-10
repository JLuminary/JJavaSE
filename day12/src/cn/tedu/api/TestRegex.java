package cn.tedu.api;

import java.util.Scanner;

/*本类用于测试正则测试*/
//需求：接受用户输入的身份证号，判断用户输入的数据是否正确
public class TestRegex {
    public static void main(String[] args) {
        //1.编辑正则表达式
        //身份证号的规律：一共18位，前17数字，第18位可能为数字 ，可能为X
        String regex = "[0-9]{17}[0-9X]";

        //2.定义变量接收用户输入的身份证号
        String input;

        //判断用户输入的数据是否符合正则表达式，如果不正确 继续输入
        do{
            //3.1提示并接收用户输入的数据
            System.out.println("请您输入您的身份证号:");
            input =new Scanner(System.in).nextLine();
            //3.2判断是否正确，如果正确，循环结束
            if(input.matches(regex)){//input 数据是否匹配matches（正则表达式）
                System.out.println("恭喜你！输入正确！");
                return;
            }
        }while(!input.matches(regex));//只要不符合正则，就循环继续输入
    }
}
