package lj.util.java;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class RundomNum implements Callable <Integer>{//jdk1.5出来的为了解决前两种的缺点

    @Override
    public Integer call() throws Exception {//返回值类型和泛型一致，可抛出异常
        System.out.println("----------");
        Thread.sleep(3000);
        return new Random().nextInt(10);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程对象
        RundomNum rn = new RundomNum();
        FutureTask ft = new FutureTask(rn);
        Thread t = new Thread(ft);
        t.start();

        //执行
        System.out.println("线程是否完成："+ft.isDone());
       Integer i = (Integer) ft.get();//get是一个阻塞的方法
        System.out.println(i);
    }
}
