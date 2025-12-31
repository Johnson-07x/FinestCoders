package MultiThreading;

class MyThread implements Runnable {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("MyThread Finished");
        }catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Basic {
    static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.start();
        try {
            t1.join();
        }catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
