package cn.tedu.exec2;

import java.util.Scanner;

//本类用作士兵类的测试类
public class TestDome {
    public static void main(String[] args) {

        //1.新建AK47对象
        AK47 a=new AK47();
        Soldier s1=new Soldier();
        s1.go();
        s1.attack();
        System.out.println("按回车射击，输入load装载子弹");
        while(true){
            String s=new Scanner(System.in).nextLine();
            if(s.equals("load")){
                a.load();
                continue;
            }
            a.fire();
        }
    }
}
