package com.company;

public class Ceiling {
    public static void main(String[] args) {

    }

    //ceiling is smallest number >= target
    static int ceiling(int[] arr, int target){

        // but what if the target element is greater than the greatest number in the array
        if (target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            //finding the middle element
            // int mid = (start + end) / 2 not using this because mmight be the integer exceeds the java capacity
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
