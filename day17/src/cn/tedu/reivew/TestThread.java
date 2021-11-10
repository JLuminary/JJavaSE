package cn.tedu.reivew;

public class TestThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

//1.自定义多线程类
class MyThread extends Thread {
    //重写父类的run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "=" + i);
        }
    }
}