package cn.tedu.basic;
/*本类用于复习循环*/
public class TestWhile {
    public static void main(String[] args) {
//        f1();//打印10次中午好
//        f2();//打印1-10
//        f3();//打印1 3 5 7 9
//        f4();//打印1+2+3
//        f5();

    }

    private static void f5() {
        int count =2;
        int sum =0;
        while(count <=100){
        sum =sum+count;
        count =count+2;
        }
        System.out.println(sum);
    }

    private static void f4() {
        int count =1;
        int sum=0;
        while(count<=10){
            sum=sum+count;
            count++;
        }
        System.out.println(sum);
    }

    private static void f3() {
        int count =1;
        while(count<100){
            System.out.println(count);
            count=count+2;
        }
    }

    private static void f2() {
        int count1=1;
        while(count1<=10){
            System.out.println(count1);
            count1++;
        }
    }

    private static void f1() {
        int count = 1;
        while(count <=10){
            System.out.println("中午好！");
            count++;
        }
    }
}
