package PracticeProblems;

import java.util.ArrayList;

public class LongestIncreasingSubarray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 9, 7, 8};
        ArrayList<Integer> current = new ArrayList<>();
        ArrayList<Integer> longest = new ArrayList<>();
        current.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                current.add(arr[i]);
            }else {
                current.clear();
                current.add(i);
            }

            if (current.size() > longest.size()) {
                longest = new ArrayList<>(current);
            }
        }
        System.out.println(longest);
    }
}
