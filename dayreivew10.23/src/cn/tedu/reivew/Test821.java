package cn.tedu.reivew;

//线程模型，Thread继承方式来实现 并加上同步锁
public class Test821 {
    public static void main(String[] args) {
        TestThread t = new TestThread();
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();
        TestThread t4 = new TestThread();
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TestThread extends Thread {
    //设置售票张数 100
    static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (TestThread.class) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < 100; i++) {
                        System.out.println(getName() + "=" + tickets--);
                    }
                }
            }
            if (tickets <= 0) break;
        }
    }
}