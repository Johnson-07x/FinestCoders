package Tasks.Day_27_12_2025;

import java.util.Scanner;

public class MaximumPairs {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no .of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr.length < 2) {
            System.out.print("No Sufficient Pairs");
            return;
        }
        int firstMax = 0;
        int secondMax = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println(firstMax + secondMax);
    }
}
