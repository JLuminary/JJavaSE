package cn.tedu.basic;

import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;

import java.util.Scanner;

/*本类用于测试分支结构*/
public class TestIf {
    public static void main(String[] args) {
        System.out.println("请您输入您的月份:");
        int month = new Scanner(System.in).nextInt();
        //对用户输入的数据进行合法性检测

        if (month < 0 || month > 12) {
            System.out.println("您的输入有误，应该是1-12月");
        } else if (month >= 3 && month <= 5) {
            System.out.println("此月份为春季");
        } else if (month >= 6 && month <= 8) {
            System.out.println("此月份为夏季");

        } else if (month >= 9 && month <= 11) {
            System.out.println("此月份为秋季");

        } else {
            System.out.println("此月份为冬季");
        }
    }
}
