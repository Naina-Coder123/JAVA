import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Search for an element (1-based index from top)
        System.out.println("Position of 10: " + stack.search(10));

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
