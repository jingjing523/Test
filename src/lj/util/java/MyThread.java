package lj.util.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//实现Runnable接口
public class MyThread implements Callable<String> {
    private static int ticket = 10;

    @Override
    public String call() throws Exception {
        while (this.ticket > 0) {
            System.out.println("剩余票数" + this.ticket--);
        }
        return "票卖完了，下次吧";
    }
}
class TestDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new MyThread());
        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
        System.out.println(task.get());//取得call方法的返回值
    }
}