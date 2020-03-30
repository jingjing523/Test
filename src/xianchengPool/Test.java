package xianchengPool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ThreadPoolExecutor t = new ThreadPoolExecutor(1,  //核心线程数
                2,  //最大线程数
                3, TimeUnit.MILLISECONDS,   //新建线程等待任务时间 最多等3ms，如果3ms没有等到，自动消亡
                new LinkedBlockingDeque<>(3));  //阻塞队列，长度为3

        //执行任务：
        //第一个任务
        t.execute(new TestThread());
        //第二个任务,第三个，第四个
        t.execute(new TestThread());//核心线程数忙着的时候，放入队列
        t.execute(new TestThread());
        t.execute(new TestThread());

        //队列满了，执行第五个----创建新线程，与核心 线程共同分担任务
        t.execute(new TestThread());
        t.execute(new TestThread());//拒绝第六个任务，报错 RejectedExecutionException
        ////关闭线程池；
        t.shutdown();
    }
}
