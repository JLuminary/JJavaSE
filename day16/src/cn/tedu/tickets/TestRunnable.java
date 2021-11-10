package cn.tedu.tickets;

/*需求：设计多线程编程模型，4个窗口共计售票100张
 * 本方案使用多线程编程方案2，实现Runnable接口的方式来完成*/
public class TestRunnable {
    public static void main(String[] args) {
        //5.创建Runnable接口的实现类对象，作为目标业务对象
        TicketRunnable target = new TicketRunnable();
        //6.创建多个Thread类线程对象，并将target业务对象交给多个线程对象来处理
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);
        Thread t4 = new Thread(target);
        //7.以多线程的方式启动多个线程对象
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

//1.自定义多线程类实现Runnable接口
class TicketRunnable implements Runnable {
    //3.定义一个成员变量，用来保存票数100
    /*由于自定义类对象只创建了一次，所以票数被所有线程对象Thread类的对象共享*/
    int tickets = 100;

    //2.添加接口中未实现的方法，方法里是我们的业务
    @Override
    public void run() {
        //4.1循环卖票
        while (true) {
            try {
                Thread.sleep(10);//让当前线程休眠10m
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "=" + tickets--);
            if (tickets <= 0) break;
        }
    }
}