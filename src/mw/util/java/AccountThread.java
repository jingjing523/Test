package mw.util.java;

public class AccountThread implements Runnable{
   //共享账号：
    private Account ac = new Account();

    @Override
    public void run() {
       getM();
    }

    public synchronized void getM(){
        if (ac.getBalance() >= 400) {
            ac.getMoney(300);
            System.out.println(Thread.currentThread().getName() + "在取款,取款余额为:" + ac.getBalance());
        } else {
            System.out.println(Thread.currentThread().getName() + "在取款，但是余额不足400,取款失败");
        }
    }
}
