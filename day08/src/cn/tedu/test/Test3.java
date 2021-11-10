package cn.tedu.test;

public class Test3 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.print(i+",");
            sum=sum+i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
