package com.company;

public class LinearSearchCode {
    public static void main(String[] args) {

        int[] nums = {32, 78, -98, 76, 34, 67};
        int target = 76;
        int ans = linearsearch(nums, target);

        System.out.println(ans);
    }

    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
