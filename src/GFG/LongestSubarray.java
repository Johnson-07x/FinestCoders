package GFG;

// User function Template for Java

class Solution6 {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j + i -1);
                }
            }
        }
        return maxLen;
    }
}


public class LongestSubarray {
    static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        Solution6 s6 = new Solution6();
        System.out.println(s6.longestSubarray(arr, k));
    }
}
