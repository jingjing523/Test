package lj.util.java;

public class TestThread extends Thread{
    //一会我要去抢资源了


    public TestThread(String name) {
        super(name);
    }

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(this.getName()+i);
        }
    }
}
