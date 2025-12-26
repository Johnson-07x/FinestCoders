package Tasks.Day_22_12_2025;

import java.util.Scanner;

public class FindNearByASCII {
    static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i<= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static int check(int x) {
        int dec = x;
        int inc = x;
        while (true) {
            if (prime(dec)){
                return dec;
            }
            if (prime(inc)) {
                return inc;
            }
            inc++;
            dec--;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Char: ");
        char x = sc.nextLine().charAt(0);
        int y = (int) x;
//        System.out.print(y);
        int temp = check(y);
        char z = (char) y;
        System.out.print(z);
    }
}
