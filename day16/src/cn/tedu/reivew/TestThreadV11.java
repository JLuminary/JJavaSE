package cn.tedu.reivew;

public class TestThreadV11 {
    public static void main(String[] args) {
        TestThreadV2 t = new TestThreadV2();
        TestThreadV2 t1 = new TestThreadV2();
        TestThreadV2 t2 = new TestThreadV2();
        TestThreadV2 t3 = new TestThreadV2();
        TestThreadV2 t4 = new TestThreadV2();
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TestThreadV2 extends Thread {
    static int tickets = 100;
//    static Object o = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (o) {
            synchronized (TestThreadV2.class) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "=" + tickets--);
                }
            }
            if (tickets <= 0) break;
        }
    }
}