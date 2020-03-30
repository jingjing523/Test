package wgtz.util.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//实现runnable接口
public class TrainTicket2 implements Runnable {
    private int ticketNum = 10;
    //创建锁
    Lock lock = new ReentrantLock();//接口=实现类（多态）

    @Override
    public void run() {
        for(int i =1;i <=100;i++){
            //打开锁
            lock.lock();
            //synchronized (this) {//加锁，锁中内容叫同步代码块,this指当前对象，即共享线程对象
               try{
                   if (ticketNum > 0) {
                       try {
                           Thread.sleep(1000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       System.out.println("我在" + Thread.currentThread().getName() + "买到了从北京到哈尔滨地火车票，现在剩余：" + (--ticketNum) + "张");
                       ////ticketNum--可能出现的错误：1.两个10；三个10：一个线程还没等到--，就被下一个线程抢了资源    2.出现0，-1
                   }
               }catch(Exception e){
                   e.printStackTrace();
               }finally{
                   lock.unlock();
               }
            //}
        }
    }
}
