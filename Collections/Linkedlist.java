import java.util.*;

public class Linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5); // Insert at beginning
        numbers.addLast(40); // Insert at end

        System.out.println("LinkedList: " + numbers);

        // Access elements
        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Last element: " + numbers.getLast());
        System.out.println("Element at index 2: " + numbers.get(2));

        // Remove elements
        numbers.removeFirst(); // Removes 5
        numbers.removeLast(); // Removes 40
        numbers.remove(Integer.valueOf(20)); // Remove element 20

        System.out.println("After removals: " + numbers);

        // Check properties
        System.out.println("Contains 10? " + numbers.contains(10));
        System.out.println("Size of list: " + numbers.size());

        // Iterate using for-each loop
        System.out.println("Traversing list:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
