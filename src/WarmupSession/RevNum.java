package WarmupSession;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Num: ");
        int num = sc.nextInt();
        int revNum = 0;
        while (num != 0) {
            int lastNum = num % 10;
            revNum = revNum * 10 + lastNum;
            num /= 10;
        }
        System.out.println(revNum);
    }
}
