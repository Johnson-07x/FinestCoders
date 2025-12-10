import java.util.Scanner;

public class ArrayMinMax {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        max(arr ,size);
        min(arr, size);
    }
    static void max(int[] arr, int size){
        int maxNum = 0;
        int maxIndex = 0;
        for (int i = 0; i < size; i++){
            if (arr[i] > maxNum){
                maxNum = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Max Number : " +maxNum);
        System.out.println("Max Index : " +maxIndex);
    }

    static void min(int[] arr, int size){
        int minNum = arr[0];
        int minIndex = 0;
        for (int i = 0; i < size; i++){
            if (arr[i] < minNum){
                minNum = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Min Number : " + minNum);
        System.out.println("Min Index : " + minIndex);
    }
}
