package cn.tedu.test;

public class Test {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(method(100));
    }

    private static int method(int i) {
        if (i <= 1) {
            return 1;
        } else {
            return method(i - 1) + i;
        }
    }
}
