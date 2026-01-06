package PracticeProblems;

import java.util.Scanner;

public class InsertAtPos_K_Times {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] elements = {100, 200, 300};
        int position = 3;
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size + elements.length];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = size - 1; i >= 0 ; i--) {
            if (position - 1 <= i) {
                arr[i + position] = arr[i];
                arr[i] = elements[index];
                index++;
            }
        }

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
