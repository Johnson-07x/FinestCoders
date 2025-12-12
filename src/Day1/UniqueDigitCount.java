package Day1;

import java.util.*;

public class UniqueDigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers you want to generate: ");
        int n = sc.nextInt();

        int[] fib = new int[n];

        // First two values
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

        // Fill Fibonacci array
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Ask user for index
        System.out.print("Enter any index to get value from array: ");
        int index = sc.nextInt();

        // Print the value at that index
        if (index >= 0 && index < n) {
            System.out.println("fib[" + index + "] = " + fib[index]);
        } else {
            System.out.println("Invalid index! Must be between 0 and " + (n - 1));
        }
    }
}
