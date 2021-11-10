package cn.tedu.tickets;

/*需求：设计多线程编程模型，4个窗口共计售票100张
 * 本方案使用多线程编程方案1，继承Thread类的方式来完成*/
public class TestThread {
    public static void main(String[] args) {
        //5.创建多个线程对象
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();
        //6.以多线程的方式启动
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

//1.自定义多线程售票类，继承Thread
class TicketThread extends Thread {
    //3.定义变量，保存要售卖的票数
    /*问题：4个线程对象共计售票400张，原因是创建了4次对象，各自操作各自的成员变量
     * 解决：让所有对象共享同一个数据，票数需要设置为静态*/
    static int tickets = 100;

    @Override
    public void run() {
        //4.1循环卖票
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "=" + tickets--);
            if (tickets <= 0) break;//注意，死循环一定要设置出口
        }
    }
}
