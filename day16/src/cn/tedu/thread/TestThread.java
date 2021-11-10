package cn.tedu.thread;

/*本来用于实现多线程编程方案一：继承Thread类的方式*/
public class TestThread {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();/*对应的是线程的新建状态*/
        MyThread m2 = new MyThread();
        MyThread m3 = new MyThread();

        //5.1测试1：自己主动调用run（），并没有多线程效果
//        m1.run();
        //5.2测试2：调用start（），以多线程的方式启动
        m1.start();/*对应的是线程的就绪状态*/
        m2.start();
        m3.start();
    }
}

//1.自定义线程类
class MyThread extends Thread {
    //2.重写父类的run（）
    @Override
    public void run() {
        //3.在run（）完成自己的业务
        //业务需求：打印10次当前正在干活的线程
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "=" + getName());
        }
    }
}
