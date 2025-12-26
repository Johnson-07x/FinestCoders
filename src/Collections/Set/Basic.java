package Collections.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Basic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            s.add(arr[i]);
        }
        int setLength = s.size();
        if (size == setLength) {
            System.out.print("true");
        }else {
            System.out.print("false");
        }
    }
}
