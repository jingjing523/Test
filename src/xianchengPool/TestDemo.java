package xianchengPool;
//内置线程池
public class TestDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("当前执行任务的线程为"+Thread.currentThread().getName());
    }
}
