package cn.tedu.basic;

import java.util.Random;
import java.util.Scanner;

/*本类用于复习switch*/
public class TestSwitch {
    public static void main(String[] args) {
            String s="";
            char a=' ';
        for (int i = 0; i < 5; i++) {
            switch (new Random().nextInt(3)) {
                case 0:
                   a=(char)(new Random().nextInt(26) + 65);break;
                case 1:
                   a=(char)(new Random().nextInt(26) + 97);break;
                case 2:
                   a=(char)(new Random().nextInt(10) + 48);break;
            }
            s=s+a;
        }
        System.out.println(s);
        System.out.println("请您输入验证码：");
        while (true){
           String input=new Scanner(System.in).nextLine();
           if(s.equalsIgnoreCase( input)){
               System.out.println("恭喜您，验证成功");
           }else{
               System.out.println("很抱歉，验证失败");
           }
           break;
        }
    }
}
