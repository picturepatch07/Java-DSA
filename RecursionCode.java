package com.company;

public class RecursionCode {
    public static void main(String[] args) {
        System.out.println(sum(5));

    }

    static int sum(int n){

        if (n == 1) return 1;
        int partialAns = sum(n-1);
        return n + partialAns;
    }
}
