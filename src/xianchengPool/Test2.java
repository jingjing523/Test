package xianchengPool;

import java.util.concurrent.*;

public class Test2 {
    public static void main(String[] args) {
        //ExecutorService es = Executors.newCachedThreadPool();//可缓存线程池
       // ExecutorService es = Executors.newFixedThreadPool(3);//定长线程池
   // ScheduledExecutorService es = Executors.newScheduledThreadPool(3);//定时线程池
        ExecutorService es = Executors.newSingleThreadExecutor();//单例线程池
        //执行任务
        for(int i = 1;i<=100;i++){
            es.execute(new TestDemo());
        }

        //关闭
        es.shutdown();
    }
}
