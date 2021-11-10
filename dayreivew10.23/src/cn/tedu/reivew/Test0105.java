package cn.tedu.reivew;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 * @author Xiloer
 */
public class Test0105 {
    public static void main(String[] args) {
        String s="";
        char c = ' ';
        int a;
        for (int i = 0; i < 5; i++) {
            switch (a = new Random().nextInt(3)) {
                case 0:
                    c = (char) (new Random().nextInt(26) + 65);
                    break;
                case 1:
                    c = (char) (new Random().nextInt(26) + 97);
                    break;
                case 2:
                    c = (char) (new Random().nextInt(9) + 48);
                    break;
            }
            s = s + c;
        }
            System.out.println(s);
            System.out.println("请您输入验证码:");
            while (true){
                String s1=new Scanner(System.in).nextLine();
                if(s.equalsIgnoreCase(s1)){
                    System.out.println("恭喜您，验证成功");
                    break;
                }
                System.out.println("很抱歉，验证失败");
            }
        }
    }

