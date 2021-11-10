package cn.tedu.review;
//练习数组的遍历
import java.util.Arrays;

public class TestArray3 {
    public static void main(String[] args) {
        int[] b={65,84,2,54,69};
        for(int i=1;i<=b.length-1;i++){
            for(int j=0;j<b.length-i;j++){
                if(b[j]>b[j+1]){
                    int t = b[j];
                    b[j] =b[j+1];
                    b[j+1] =t;
                }
            }
            System.out.println("第"+i+"轮"+Arrays.toString(b));
        }
        System.out.println(Arrays.toString(b));
    }
}
