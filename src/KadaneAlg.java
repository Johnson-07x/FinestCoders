import java.util.Scanner;

public class KadaneAlg {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        calculate(arr, arrSize);
    }

    static void calculate(int[] arr, int arrSize){
        int current = arr[0];
        int max = arr[0];
        for (int i = 1; i < arrSize; i++){
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }
        System.out.println(max);
    }
}
