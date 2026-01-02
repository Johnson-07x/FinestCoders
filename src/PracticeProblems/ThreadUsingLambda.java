package PracticeProblems;

public class ThreadUsingLambda {
    public static boolean flag = true;
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            while (flag) {
                System.out.println("Thread 1 is Running");

            }
            System.out.println("Thread 1 is stopped");

        }
        );
        t1.start();
        try {
            t1.sleep(10);
            flag = false;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
