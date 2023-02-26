package com.company;


public class ValidPalindrom {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while(start < end){
            if(ch[start] != ch[end]) System.out.println("false");
            else {
                start++;
                end--;
            }
        }
        System.out.println("true");
    }
}
