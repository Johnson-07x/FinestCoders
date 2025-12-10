import java.util.Scanner;

public class FindMedian {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        median(arr, arrSize);
    }

    static void median(int[] arr, int arrSize){
        int negativeCount = 0;
        for (int i = 0; i < arrSize; i++){
            if (arr[i] < 0){
                negativeCount++;
            }
        }
        int newArrSize = arrSize - negativeCount;
        int[] newArr = new int[newArrSize];
        int i = 0;
        for (int x : arr){
            if (x > 0){
                newArr[i] = x;
                i++;
            }
        }
        int numOfPositive = 0;
        for (int j = 0; j < newArrSize; j++) {
            numOfPositive++;
        }
        if (newArrSize % 2 != 0){
            int median = newArrSize /2;
            System.out.println(median);
            System.out.println(newArr[median]);
        }else if (newArrSize % 2 == 0){
            int median1 = newArrSize /2 -1;
            int median2 = newArrSize / 2;
            int total = newArr[median1] + newArr[median2];
            int finalMedian = total / 2;
            System.out.println(finalMedian);
        }else{
            System.out.println("0");
        }
    }
}
