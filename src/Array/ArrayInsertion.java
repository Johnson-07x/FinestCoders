package Array;

import java.util.Scanner;

public class ArrayInsertion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        arrayOperation(arr ,size);

    }
    static void arrayOperation(int[] arr, int size){
        Scanner sc = new Scanner(System.in);
        for (int i =0; i < size-1; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter new Number to Add: ");
        int newNumber = sc.nextInt();

        for (int i = size; i >=0; i--){

        }
    }
}
