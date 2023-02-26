package com.company;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int sum  = 0;
        for(int i=2; i<num/i;i++){
            if(num % i == 0){
                sum = sum + i;

            }
            if(sum > num) System.out.println("false");
            if(num == sum+1) System.out.println("true");
        }
    }
}
