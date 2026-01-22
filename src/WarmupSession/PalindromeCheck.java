package WarmupSession;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int actualNum = num;
        int revNum = 0;
        while (num != 0) {
            int lastNum = num % 10;
            revNum = (revNum * 10) + lastNum;
            num /= 10;
        }
        if (actualNum == revNum) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
