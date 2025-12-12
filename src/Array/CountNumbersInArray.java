package Array;

import java.util.Scanner;

public class CountNumbersInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        int num = 5;
        for (int i = 0; i < arrSize; i++){
            arr[i] = sc.nextInt();
        }
        countNumbers(arr, num);
    }

    static void countNumbers(int[] arr, int num){
        int count = 0;
        int lastdigit = 0;
        for (int i = 0; i < arr.length; i++){
            num = arr[i];
            while (num != 0){
                lastdigit = num % 10;
                if(lastdigit == 5){
                    count++;
                }
                num /= 10;
            }
        }
        System.out.println(count);
    }
}
