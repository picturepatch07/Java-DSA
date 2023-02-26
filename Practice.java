package com.company;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
//        int[] nums = {1,2,1};
//        int n = nums.length;
//        Stack<Integer> stack = new Stack<>();
//        int[] nge = new int[nums.length];
//
//        for (int i = 2*n-1; i >= 0; i--) {
//            while (!stack.empty() && stack.peek() <= nums[i%n])
//                stack.pop();
//            if (i < n)
//                if (!stack.empty())
//                    nge[i] = stack.peek();
//                else
//                    nge[i] = -1;
//            stack.push(nums[i%n]);
//        }
//
//        System.out.println(Arrays.toString(nge));
//
//        Stack<Integer> stack = new Stack<>();
//
//        for (int n : nums2) {
//            while (!stack.isEmpty() && stack.peek() < n) {
//                map.put(stack.pop(), n);
//            }
//
//            stack.push(n);
//        }
//
//        for (int i = 0; i < nums1.length; i++) {
//            nums1[i] = map.getOrDefault(nums1[i], -1);
//        }
//
//        System.out.println(Arrays.toString(nums1));
        
        int[] arr = {10,25,20,15,7};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {10,25,20,15,7};
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = i; j >= 0 ; j--) {
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
