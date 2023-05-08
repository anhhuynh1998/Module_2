package queue_And_stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        int[] numbers = {5,1,7,9};
        reverse(numbers);
        System.out.println();
    }
    public static int reverse(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for ( int i : numbers) {
            stack.push(i);
        }
          int i = 0;
        while (!stack.isEmpty()){
            stack.pop();
        }
        return 0;
    }

}
