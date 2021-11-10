package cn.tedu.tickets;

/*本类用于测试同步锁*/
public class TestRunnableV2 {
    public static void main(String[] args) {
        //5.创建Runnable接口的实现类对象，作为目标业务对象
        TicketRunnableV2 target = new TicketRunnableV2();
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

/*同步锁：相当于给容易出现问题的代码出了一把锁，包裹了所有可能会出现安全问题的代码
 * 加锁之后，就有了同步（排队）的效果，但是加锁的范围要考虑
 * 不能太大，太大，干啥都要排队，效率低，也不能太小，太小，锁不住，还是会有安全隐患*/
//1.自定义多线程类实现Runnable接口
class TicketRunnableV2 implements Runnable {
    //3.定义一个成员变量，用来保存票数100
    /*由于自定义类对象只创建了一次，所以票数被所有线程对象Thread类的对象共享*/
    int tickets = 100;
    Object o = new Object();

    //2.添加接口中未实现的方法，方法里是我们的业务
    @Override
    public void run() {
        while (true) {
            /*同步代码块：synchronized（锁对象）{会出现安全隐患的所有代码}
             * 在同步代码块中的代码，同一时刻只会被一个线程执行
             * */
//            synchronized (new object) {//不对！这样锁对象不唯一！
            synchronized (o) {//上面new了一次，所以锁对象是唯一的，正确，解决重卖的问题
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);//让当前线程休眠10m
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