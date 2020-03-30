package wgtz.util.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BuyTrainTicket extends  Thread {
    //属性：
    private static int ticketNum = 10;

    //买来一把锁
    Lock lock = new ReentrantLock();//接口 = 实现类（多态）

    //构造器：设置窗口名

    public BuyTrainTicket(String name) {
        super(name);
    }

    @Override
    public void run() {//可能出现的错误：1.两个10；三个10：一个线程还没等到--，就被下一个线程抢了资源    2.出现0，-1
        for (int i = 1; i <= 100; i++) {
           // synchronized (BuyTrainTicket.class) {//将this改为常量”abc"，因为常量是唯一的；一般改为类名.class，获取类的字节码信息,并且只能放引用类型
               //打开锁
            lock.lock();
            if (ticketNum > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我在" + this.getName() + "买到了从北京到哈尔滨地火车票，还剩：" + (--ticketNum) + "张火车票");
                }
                lock.unlock();
          //  }
        }
    }
}


