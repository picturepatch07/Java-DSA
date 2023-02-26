package com.company;

public class XMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {2,0,0,1},
                {0,3,1,0},
                {0,5,2,0},
                {4,0,0,2}
        };
        System.out.println(check(arr));
    }
    private static boolean check(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][i] == 0) {
                return false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i + j == arr[i].length - 1){
                    if(arr[i][j] == 0) {
                        return false;
                    }
                }

            }
        }
        for(int i = 0; i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                if(i + j != arr[i].length - 1){
                    if(arr[i][j] != 0 & (i != j)){
                       return false;
                    }
                }
                break;
            }
        }
        return true;
    }
}
