package lj.util.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//实现一个秒表
public class Clock {
    public static void main(String[] args) throws InterruptedException {
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
       while(true){
           Date d = new Date();
           String s = df.format(d);
           System.out.println(s);
           Thread.sleep(1000);
       }
    }
}
