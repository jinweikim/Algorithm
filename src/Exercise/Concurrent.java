package Exercise;

import com.sun.tools.javac.Main;

import java.util.concurrent.atomic.AtomicInteger;

public class Concurrent {
//    public static int num = 0;
    public static final Integer mutex = 0;
    public static AtomicInteger num = new AtomicInteger(0);
    public static void main(String[] args) {
        for (int i = 0; i < 3; i ++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (num.get() < 1000) {
                        System.out.println(Thread.currentThread().getName() + " " + num.incrementAndGet());
                    }
                }
            });
            t.start();
        }
    }
}
