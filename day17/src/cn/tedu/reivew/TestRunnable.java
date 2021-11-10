package cn.tedu.reivew;
/*本类用于复写多线程方案2：实现Runnable*/
public class TestRunnable {
    public static void main(String[] args) {
        //4.创建目标业务类对象--只创建一次
        MyRunnable target =new MyRunnable();
        //5.创建多个线程对象，并把之前的任务发布给当前的线程对象
        Thread t1=new Thread(target);
        Thread t2=new Thread(target);
        Thread t3=new Thread(target);
        Thread t4=new Thread(target);
        Thread t5=new Thread(target);
        //6.以多线程的方式启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
//1.作为目标业务类
class MyRunnable implements Runnable{
    //2.实现接口中未实现的方法，里面是业务
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"="+i);
        }
    }
}