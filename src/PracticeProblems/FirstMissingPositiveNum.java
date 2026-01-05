package PracticeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositiveNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = 0;
        int check = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 1) {

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
