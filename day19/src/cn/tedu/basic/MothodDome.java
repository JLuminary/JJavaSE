package cn.tedu.basic;
/*本类用于测试方法的调用*/
public class MothodDome {
    public static void main(String[] args) {
        System.out.println("main() start");
        mothod1();
        System.out.println("main() stop");

    }

    private static void mothod2() {
        System.out.println("m2 start");
        System.out.println("m2 stop");
    }

    private static void mothod1() {
        System.out.println("m1 start");
        mothod2();
        System.out.println("m1 stop");
    }
}
