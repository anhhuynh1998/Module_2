package queue_And_stack.reverse_array;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original string: " + str);
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    str = str.substring(0, i - stack.size()) + stack.pop() + str.substring(i - stack.size() + 1);
                }
            }
        }
        while (!stack.isEmpty()) {
            str = str.substring(0, str.length() - stack.size()) + stack.pop() + str.substring(str.length() - stack.size() + 1);
        }
        return str;
    }
}
