package com.company;

import java.util.Arrays;

public class MinimumSumAfterSplitting {
    public static void main(String[] args) {

        int num = 4009;

        int[] digit = new int[4];
        for (int i = 0; i < 4; i++) {
            digit[i] = num%10;
            num = num/10;
        }
        Arrays.sort(digit);
        int ans = digit[0]*10 + digit[2] + digit[1]*10 + digit[3];
        System.out.println(ans);
    }
}
