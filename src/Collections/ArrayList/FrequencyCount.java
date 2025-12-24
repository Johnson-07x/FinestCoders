package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        System.out.print("Enter the Array Size: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        for (int i = 0; i < arr.size(); i++){
            int currNum = arr.get(i);
            int freqCount = Collections.frequency(arr, currNum);
            newArr.add(freqCount);
        }
        for (int n : newArr){
            System.out.print(n + " ");
        }
    }
}
