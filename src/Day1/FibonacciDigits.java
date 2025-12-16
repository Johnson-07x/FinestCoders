package Day1;

import java.util.Scanner;

public class FibonacciDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int temp = 0;
        for (int i = 0; i < num; i++){
            System.out.print(firstNum + " ");
            temp = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = temp;
        }
    }
}