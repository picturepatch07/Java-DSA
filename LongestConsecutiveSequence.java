package com.company;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,3,2,1};
        Arrays.sort(nums);
        int count = 1;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] + 1 == nums[i + 1]) {
                    count++;
                } else if (nums[i] == nums[i + 1]) {
                    continue;
                } else {
                    count = 1;
                }
            }
            max = Math.max(count,max);
        }

        System.out.println(max);
    }
}
