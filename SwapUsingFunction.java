package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SwapUsingFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int[] arr = {32, 54, 65, 42, 1};
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        swap(arr, 1, 2);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
