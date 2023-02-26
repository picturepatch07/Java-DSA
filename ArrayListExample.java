package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(89);
//        list.add(353);
//        list.add(354);
//        list.add(567);
//        System.out.println(list);
//
//        list.set(0, 7456);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }

        int a = 0;
        //to get the elements we have to use .get function we can not use list[i]
        for (int i = 0; i < 5; i++) {
            //System.out.println(list.get(i));
            a = list.get(i);
        }
        System.out.println(a);
    }
}
