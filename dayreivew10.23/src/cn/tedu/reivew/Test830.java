package cn.tedu.reivew;

//编写线程售票 用Runnable接口实现
public class Test830 {
    public static void main(String[] args) {
        TestRunnable result=new TestRunnable();
        Thread t=new Thread(result);
        Thread t1=new Thread(result);
        Thread t2=new Thread(result);
        Thread t3=new Thread(result);
        Thread t4=new Thread(result);
        Thread t5=new Thread(result);
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class TestRunnable implements Runnable {
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
