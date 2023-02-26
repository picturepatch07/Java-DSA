package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortingCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {5, 4, 1, 2, 3};
        bubble(arr);
        selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxindex = getmaxindex(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }

    static int getmaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start ; i <= end ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n - 1 times
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            //for each step, max index will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
        }
    }
}
