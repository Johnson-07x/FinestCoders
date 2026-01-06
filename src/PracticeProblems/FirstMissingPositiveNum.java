package PracticeProblems;

import java.util.Arrays;
import java.util.Scanner;

class Check {
    public int minPositive (int[] arr) {
        Arrays.sort(arr);
        int check = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] == check) {
                    check++;
                }else if (arr[i] > check){
                    return check;
                }
            }
        }
        return check;
    }
}

public class FirstMissingPositiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Check c = new Check();
        System.out.println(c.minPositive(arr));
    }
}
