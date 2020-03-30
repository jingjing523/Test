package xianchengPool;
//自定义线程---与Test
public class TestThread implements Runnable{
    @Override
    public void run() {
        System.out.println("当前执行任务的线程为"+Thread.currentThread().getName());
    }
}
