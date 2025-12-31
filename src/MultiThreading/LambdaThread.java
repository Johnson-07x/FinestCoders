package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

class counter {
    AtomicInteger count = new AtomicInteger();
    synchronized void fun() {
        count.incrementAndGet();
    }
}

public class LambdaThread {
    static void main(String[] args) throws InterruptedException {
        counter c = new counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                c.fun();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                c.fun();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
