package WarmupSession;

import java.util.Scanner;

public class RotatingArray {
    static void rotate (int[] arr, int size, int k) {
        int[] temp = new int[size];
        int pos = 0;
        for (int i = k + 1; i < size; i++) {
            temp[pos] = arr[i];
            pos++;
        }

        for (int i = 0; i < size - k; i++) {
            temp[pos] = arr[i];
            pos++;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter no.of Times to Rotate: ");
        int k = sc.nextInt();
        k %= size;
        rotate(arr, size, k);
    }
}
