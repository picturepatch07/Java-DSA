package com.company;

public class MathsDSA {
    public static void main(String[] args) {
        //int a = 4;
        int[] arr = {2,3,2,4,6,3,4};
        System.out.println((11 & 1));
    }

    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    private static int ans(int[] arr){
        int unique = 0;

        for(int n : arr){
            unique = unique ^ n;
        }

        return unique;
    }
}
