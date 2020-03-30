package shengchanxiaofei2;

public class Test {
    public static void main(String[] args) {
        Product p = new Product();

        ProducerThread pt = new ProducerThread(p);
        CustomerThread ct = new CustomerThread(p);
        ct.start();
        pt.start();
    }
}
