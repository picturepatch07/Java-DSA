package com.company;

public class LinearSearchString {
    public static void main(String[] args) {
        String  name = "abhishek";
        char target = 'i';
        System.out.println(linearsearch(name, target));
    }

    static boolean linearsearch(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
