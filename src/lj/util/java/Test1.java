package lj.util.java;

public class Test1 extends Thread {
    public static void main(String[] args) {//主线程

        Thread.currentThread().setName("主线程:");


       TestThread tt = new TestThread("子线程01");//子线程
      //  tt.setName("第一个子线程：");
        tt.start();//父类中的方法，表示线程启动

        for(int i = 1;i<= 10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
