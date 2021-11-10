package cn.tedu.reivew;

public class TestRunnableV11 {
    public static void main(String[] args) {
        TestRunnableV2 t = new TestRunnableV2();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);
        Thread t4=new Thread(t);
        Thread t5=new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

class TestRunnableV2 implements Runnable {
    int tickets = 100;
    Object o = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < 100; i++) {
                        System.out.println(Thread.currentThread().getName() + "=" + tickets--);
                    }
                }
            }
            if (tickets <= 0) break;
        }
    }
}