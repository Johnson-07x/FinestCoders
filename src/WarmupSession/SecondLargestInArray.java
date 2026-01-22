package WarmupSession;

import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }else if (arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
