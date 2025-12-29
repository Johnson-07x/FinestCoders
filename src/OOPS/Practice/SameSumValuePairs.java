package OOPS.Practice;

import java.util.Scanner;

public class SameSumValuePairs {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter (K) value: ");
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j) {
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
        }
    }
}
