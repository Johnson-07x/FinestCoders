package MultiThreading;

class MyThread2 implements Runnable {
    public void run() {
        System.out.println("Thread");
    }
}

public class Sample {
    static void main(String[] args) {
        Thread t1 = new Thread(new MyThread2());
        Thread t2 = new Thread(new MyThread2());
        Thread t3 = new Thread(new MyThread2());
        Thread t4 = new Thread(new MyThread2());
        Thread t5 = new Thread(new MyThread2());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
