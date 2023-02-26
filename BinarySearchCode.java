package com.company;

public class BinarySearchCode {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 12, 14, 17, 23, 35, 55, 78, 99, 220};
        int target = 99;
        int ans = binarysearch(nums, target);
        System.out.println(ans);
    }

    //return the index of the target element
    //return -1 if the element is not found
    static int binarysearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            //finding the middle element
            // int mid = (start + end) / 2 not using this because might be the integer exceeds the java capacity
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                //answer found
                return mid;
            }


        }
        return -1;
    }
}


