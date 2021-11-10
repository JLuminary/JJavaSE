package cn.tedu.exec2;

import java.util.Random;

//本类用于OOP总和案例--武器类
public class AK47 {
    //1.定义属性
    int bullets = 105;//定义子弹初始值为100发

    //2.定义功能
    public void fire(){
        //2.1首先判断枪里是否还有子弹
        if(bullets == 0){
            System.out.println("没有子弹了");
            return;
        }
        //2.2生成一个随机值作为本次子弹发射的数量，范围[0,10)
        int r=new Random().nextInt(10);
        //2.3 判断实际子弹是够用，有多少发多少
        if(r > bullets){
            r = bullets;//当之前的实际子弹数赋值给随机数r
        }
        bullets = bullets-r;//发射子弹
        //2.4为了游戏效果发射几发子弹就在控制台打印几个突
        for (int i = 0; i < r; i++) {
            System.out.print("突");
        }
        System.out.println("~");
        //2.5如果子弹数为0，提示用户弹夹空了
        if(bullets == 0){
            System.out.println("没有子弹了");
        }
    }
    //2.1 装在子弹的功能
    public void load(){
        bullets = 100;
        System.out.println("弹夹已装满");
    }
}

