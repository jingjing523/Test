package wgtz.util.java;

public class TestTickets {
    public static void main(String[] args) {//创建三个线程对象，各自用各自的锁，相当于出现了3把锁，会产生错误，需要将锁改为唯一的
        BuyTrainTicket b1 = new BuyTrainTicket("窗口一");
        b1.start();
        BuyTrainTicket b2 = new BuyTrainTicket("窗口二");
        b2.start();
        BuyTrainTicket b3 = new BuyTrainTicket("窗口三");
        b3.start();
    }
}
