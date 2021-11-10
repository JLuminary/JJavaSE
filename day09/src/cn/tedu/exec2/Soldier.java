package cn.tedu.exec2;

import java.util.Random;

//本类用于OOP总和案例--士兵类
//1.定义士兵类
public class Soldier {
    //2.定义士兵类属性
    int id;//士兵游戏
    int blood=100;//默认血量值100
    AK47 a;//引用类型AK47作为属性，相当于给士兵配枪

    //3.定义士兵类的方法
    public void go(){
        System.out.println(this.id+"号士兵在前进");
    }
    public void attack(){
        //4.在攻击之前先判断士兵是否还活着，如果阵亡直接结束当前进攻方法
        if(blood == 0){
            System.out.println("这是"+this.id+"号士兵的尸体");
            return;/*结束当前方法attack()*/
        }
        System.out.println(this.id+"号士兵进攻!");
        if(a !=null){
            a.fire();//调用AK47的开火方法
        }

        //1.生成一个随机数d，模拟进攻时掉血，随机数范围是[0,10)
        int d=new Random().nextInt(10);
        blood=blood-d;//减去血量
        //2.血量不允许为负数,血量最多减到0，如果出现负数，重置成0
        if(blood < 0){
            blood = 0;
        }
        //3.当血量为0时，说明士兵阵亡
        if(blood == 0){
            System.out.println(this.id+"号士兵已经阵亡");
        }
    }

}

