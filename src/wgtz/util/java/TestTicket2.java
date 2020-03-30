package wgtz.util.java;

public class TestTicket2 {
    public static void main(String[] args) {//之创建一个线程对象，相当于不同线程用同一把锁
        TrainTicket2 t = new TrainTicket2();
        new Thread(t,"窗口一").start();
        //TrainTicket2 t2 = new TrainTicket2();
        new Thread(t,"窗口二").start();
        //TrainTicket2 t3 = new TrainTicket2();
        new Thread(t,"窗口三").start();
    }
}
