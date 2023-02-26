package com.company;

import java.util.Stack;

public class InBuiltStackQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(32);
        stack.push(49);
        stack.push(98);
        stack.push(33);
        stack.push(01);
        stack.push(21);

        System.out.println(stack.pop());
    }
}
