package queue_And_stack.deployment_stack_linkedList;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("size :" + stack.size());
        System.out.printf("elements from stack");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
