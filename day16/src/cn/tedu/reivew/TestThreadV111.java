package cn.tedu.reivew;

public class TestThreadV111 {
    public static void main(String[] args) {
        TestThreadV22 t = new TestThreadV22();
        TestThreadV22 t1 = new TestThreadV22();
        TestThreadV22 t2 = new TestThreadV22();
        TestThreadV22 t3 = new TestThreadV22();
        TestThreadV22 t4 = new TestThreadV22();
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
   class TestThreadV22 extends Thread {
        static int tickets = 100;

        @Override
        public void run() {
            while (true) {
                synchronized (TestThreadV22.class) {
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
                if (tickets <= 0) break;//结束售票
            }
        }
    }

