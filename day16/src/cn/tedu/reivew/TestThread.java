package cn.tedu.reivew;

public class TestThread {
    public static void main(String[] args) {
        TestThreadV1 t = new TestThreadV1();
        TestThreadV1 t1 = new TestThreadV1();
        TestThreadV1 t2 = new TestThreadV1();
        TestThreadV1 t3 = new TestThreadV1();
        TestThreadV1 t4 = new TestThreadV1();
        TestThreadV1 t5 = new TestThreadV1();

        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class TestThreadV1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "=" + i);
        }
    }
}