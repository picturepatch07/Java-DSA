package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //char name = scan.next().trim().charAt(0);
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        return sum == original;
    }
}
