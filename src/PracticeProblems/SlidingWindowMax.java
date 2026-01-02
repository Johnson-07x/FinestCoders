package PracticeProblems;

import java.util.*;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int[] result = slidingWindowMax(arr, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] slidingWindowMax(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // Remove indices out of current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements (they’re useless)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            // Add max for current window
            if (i >= k - 1) {
                res[i - k + 1] = arr[dq.peekFirst()];
            }
        }
        return res;
    }
}
