package shengchanxiaofei2;

public class ProducerThread extends Thread{//生产者
    private Product p;
    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for(int i =1;i<=10;i++) {
                if (i % 2 == 0) {
                   p.setProduct("费列罗","巧克力");
                } else {
                   p.setProduct("哈尔滨","啤酒");
                }
                //打印信息
            }
    }
}
