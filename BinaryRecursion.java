package com.company;

public class BinaryRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 12, 34};
        int target = 9;

        System.out.println(binaryrecursion(arr, 0, arr.length - 1, target));
    }

    static int binaryrecursion(int[] arr, int start, int end, int target){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            else if (target > arr[mid]){
                return binaryrecursion(arr, mid + 1, arr.length - 1, target);
            }
            else {
                return binaryrecursion(arr, 0, mid, target);
            }
        }
        return -1;
    }
}
