package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] nums = {2, 4, 5, 8, 19, 23, 35, 55, 67};
        int target = 19;
        int ans = OrderAgnosticBS(nums, target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending order

        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc = true;
        }
        else {
            isAsc = false;
        }
        while (start <= end){
            //finding the middle element
            // int mid = (start + end) / 2 not using this because mmight be the integer exceeds the java capacity
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
                else if (target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
        }
        return -1;
    }
}
