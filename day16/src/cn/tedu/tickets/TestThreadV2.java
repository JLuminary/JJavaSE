package cn.tedu.tickets;

public class TestThreadV2 {
    public static void main(String[] args) {
        //5.创建多个线程对象
        TicketThreadV2 t1 = new TicketThreadV2();
        TicketThreadV2 t2 = new TicketThreadV2();
        TicketThreadV2 t3 = new TicketThreadV2();
        TicketThreadV2 t4 = new TicketThreadV2();
        //6.以多线程的方式启动
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

//1.自定义多线程售票类，继承Thread
class TicketThreadV2 extends Thread {
    //3.定义变量，保存要售卖的票数
    /*问题：4个线程对象共计售票400张，原因是创建了4次对象，各自操作各自的成员变量
     * 解决：让所有对象共享同一个数据，票数需要设置为静态*/
    static int tickets = 100;
//    static Object o = new Object();

    @Override
    public void run() {
        //4.1循环卖票
        while (true) {
//            synchronized (o) {
            /*我们没通过class关键字创建一个类，就会在工作空间生成唯一对应类名。class字节码文件
            * 这个类名。class对应的对象，我们称之为这个类的字节码对象
            * 字节码对象极其重要，是反射技术的基石，字节码对象中包含了当前所有的关键信息
            * 所有，用这样一个唯一一旦明确的对象作为同步代码块的锁的对象，再合适不过了*/
            synchronized (TicketThreadV2.class) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "=" + tickets--);
                }
                if (tickets <= 0) break;//注意，死循环一定要设置出口
            }
        }
    }
}