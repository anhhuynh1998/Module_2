package queue_And_stack.reverse_array;

import java.util.Stack;

public class ReverseArrayStack {
    public static void main(String[] args) {
        int[] arr = {6,56,878,9};
        System.out.println(arr);
    }
    public static void reverseArray(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            stack.pop();
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

}
