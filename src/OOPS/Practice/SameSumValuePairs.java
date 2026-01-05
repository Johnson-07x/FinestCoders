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
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = 0;
                if (i != j) {
                    sum += arr[i] + arr[j];
                    if (sum == k) {
                        System.out.println(arr[i] + " " + arr[j]);
                    }
                }
            }
        }
    }
}
