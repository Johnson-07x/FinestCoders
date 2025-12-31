package ExceptionHandling;

public class TrialProg {
    static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error Occurred : " + e);
        }
        System.out.println(a+b);
    }
}
