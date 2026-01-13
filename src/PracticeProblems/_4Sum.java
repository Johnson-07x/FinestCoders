package PracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _4Sum {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        int index = 0;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                int left = j + 1;
                int right = length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        l.add(new ArrayList<>());
                        l.get(index).add(nums[i]);
                        l.get(index).add(nums[j]);
                        l.get(index).add(nums[left]);
                        l.get(index).add(nums[right]);
                        index++;
                        left++;
                    } else if (sum < target) {
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return l;
    }

    static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}
