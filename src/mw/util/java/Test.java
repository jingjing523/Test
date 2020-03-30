package mw.util.java;

public class Test {
    public static void main(String[] args) {
        AccountThread ac = new AccountThread();
        new Thread(ac,"男主人").start();
        new Thread(ac,"女主人").start();
    }
}
