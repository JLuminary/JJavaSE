package cn.tedu.reivew;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*本类用于复写接口方式的售票案例*/
public class TicketRunnable {
    public static void main(String[] args) {
        TicketR target = new TicketR();
//        Thread t1 = new Thread(target);
//        Thread t2 = new Thread(target);
//        Thread t3 = new Thread(target);
//        Thread t4 = new Thread(target);
//        Thread t5 = new Thread(target);
//        //6.以多线程的方式启动线程
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
        /*Executors是用来辅助创建线程池的工具类
        * 常用方法：
        * newFinxedThreadPool（int）这个方法可以创建指定数目的线程池对象
        * 创建出来的线程池对象就是ExecutorService，负责：新建/启动/销毁 线程
        * */
        ExecutorService pool = Executors.newFixedThreadPool(50);
        for (int i = 0; i < 50; i++) {
            pool.execute(target);
        }
    }
}

class TicketR implements Runnable {
    int tickets = 1000;
    Object o=new Object();
    //2.实现父类接口中未实现的方法，里面是我们的业务
    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "=" + tickets--);
                }
                if (tickets <= 0) break;
            }
        }
    }
}
