package cn.tedu.reivew;

public class TicketThread {
    public static void main(String[] args) {
     TicketT t1=new TicketT();
     TicketT t2=new TicketT();
     TicketT t3=new TicketT();
     TicketT t4=new TicketT();
     TicketT t5=new TicketT();
     t1.start();
     t2.start();
     t3.start();
     t4.start();
     t5.start();


    }
}
class TicketT extends Thread{
    static int tickets =100;
    @Override
    public void run() {
        while(true){
          synchronized (TicketR.class){
              if(tickets >0){
                  try {
                      Thread.sleep(3);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println(getName()+"="+tickets--);
              }
              if (tickets <=0)break;
          }
        }
    }
}
