package Array;

import java.util.Scanner;

public class BruteForceBasic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        findMax(arr, arrSize);
    }

    static void findMax(int[] arr, int arrSize){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                int num = arr[i];
                num += arr[j];
                if (num > max){
                    max = num;
                }
            }
        }
        System.out.println(max);
    }
}
