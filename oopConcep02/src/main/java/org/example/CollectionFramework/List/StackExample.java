package org.example.CollectionFramework.List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("java");
        stack.push("java");
        stack.push("python");
        stack.push("C#");
        stack.push(null);
        System.out.println(stack);

        // First in Last out
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

    }
}
