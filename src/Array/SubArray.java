package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int[] sub = Arrays.copyOfRange(arr, i, j + 1);
                System.out.println(Arrays.toString(sub));
            }
        }
    }
}
