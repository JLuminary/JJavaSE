package cn.tedu.thread;

/*本类用于多线程编程实现方案二*/
public class TestRunnable {
    public static void main(String[] args) {
        //创建自定义线程类对象--业务对象
        MyRunnable my = new MyRunnable();
        //5.创建的是线程对象，并将业务对象交给线程对象
        Thread t=new Thread(my);
        Thread t1=new Thread(my);
        Thread t2=new Thread(my);
        Thread t3=new Thread(my);
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}

//1.自定义多线程类
class MyRunnable implements Runnable {
    //2.添加父接口中为实现的抽像方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            /*问题：自定义类与父接口Runnable中都没有获取名字的方法
            * 所以需要从Thread类里找
            * currrentThread（）：静态方法，获取当前正在执行的线程对象
            * getname（）：获取当前正在执行的线程对象的名称*/
            System.out.println(Thread.currentThread().getName() + "==" + i);
        }
    }
}