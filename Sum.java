package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("Sum = "+ sum);
    }
}
