package WarmupSession;

import java.util.Scanner;

public class PrimeFactorsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        int i = 2;
        while (num > 1) {
            if (num % i == 0) {
                System.out.println(i);
                num /= i;
            } else {
                i++;
            }
        }
    }
}
