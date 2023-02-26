package com.company;

public class Pattern {
    public static void main(String[] args) {
        pattern13(5);
    }
    static void pattern1(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n - rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols <= rows ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int rows = 0; rows < 2 * n - 1; rows++) {
            for (int cols = 0; cols <= rows ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int rows = 1; rows <= n; rows++) {
            int space = n - rows;
            for (int cols = 1; cols <= space; cols++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7 (int n) {
        for (int rows = 0; rows < n; rows++) {
            int space = rows;
            for (int cols = 0; cols <= space; cols++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < n - rows ; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern8 (int n ) {
        for (int rows = 0; rows <= n; rows++) {
            int space = n - rows - 1;
            for (int cols = 0; cols <= space; cols++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < 2 * rows - 1; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern9 (int n) {
        for (int rows = 0; rows < n; rows++){
            int space = rows;
            for (int cols = 0; cols <= space; cols++){
                System.out.print(" ");
            }
            for (int cols = 0; cols < 2 * n - 2 * rows - 1; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10 (int n) {
        for (int rows = 0; rows < n; rows++){
            int space = n - rows - 1;
            for (int cols = 0; cols <= space; cols++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < rows + 1; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern11 (int n) {
        for (int rows = 0; rows < n; rows++) {
            int space = rows;
            for (int cols = 0; cols <= space; cols++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < n - rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern12 (int n) {
        for (int rows = 0; rows < 2 * n; rows++) {
            if (rows < n){
                int space = rows;
                for (int cols = 0; cols <= space; cols++) {
                    System.out.print(" ");
                }
            }
            else if (rows >= n){
                int space = 2 * n - rows - 1;
                for (int cols = 0; cols <= space; cols++) {
                    System.out.print(" ");
                }
            }
            if (rows < n){
                for (int cols = 0; cols < n - rows; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else if (rows >= n){
                for (int cols = 0; cols < rows - n + 1; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    static void pattern13 (int n) {
        for (int rows = 0; rows < n; rows++){
            if (rows == n - 1){
                for (int cols = 0; cols < rows + n; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else if (rows == 0){
                for (int cols = 0; cols <= rows; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else if (rows > 0 && rows < n - 1){
                for (int cols = 0; cols < 2; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
