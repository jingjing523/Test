package lj.util.java;

public class Priorty  implements  Runnable{
    @Override
    public void run() {
        for(int i =0;i<5;i++){
            System.out.println("当前线程"+Thread.currentThread().getName()+",i="+i);
        }
    }

    public static void main(String[] args) {
        Priorty mt = new Priorty();
        Thread t1 = new Thread(mt,"1");
        Thread t2 = new Thread(mt,"2");
        Thread t3 = new Thread(mt,"3");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
       t2.start();
        t3.start();

    }
}
