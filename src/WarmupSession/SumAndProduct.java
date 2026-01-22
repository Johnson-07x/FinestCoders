package WarmupSession;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (num != 0) {
            int lastNum = num % 10;
            sum += lastNum;
            product *= lastNum;
            num /= 10;
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
