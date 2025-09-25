import java.util.LinkedList;

/**
 * A basic demonstration of the LinkedList class in Java.
 * This program covers common operations like adding, accessing, and removing
 * elements, including methods specific to LinkedList (e.g., addFirst, removeLast).
 */
public class LinkedListBasics {

    public static void main(String[] args) {

        // --- 1. Creating a LinkedList ---
        // LinkedList implements both the List and Deque interfaces.
        // It's efficient for adding/removing elements from the start or end.
        LinkedList<String> travelDestinations = new LinkedList<>();
        System.out.println("Created an empty LinkedList.");

        // --- 2. Adding Elements ---
        System.out.println("\n--- Adding Elements ---");
        // add() or addLast() adds an element to the end.
        travelDestinations.add("Paris");
        travelDestinations.add("Tokyo");
        travelDestinations.add("Rome");
        System.out.println("After adding to the end: " + travelDestinations);

        // addFirst() adds an element to the beginning.
        travelDestinations.addFirst("Sydney");
        System.out.println("After addFirst('Sydney'):  " + travelDestinations);

        // add(index, element) inserts at a specific position.
        travelDestinations.add(2, "Cairo");
        System.out.println("After add(2, 'Cairo'):    " + travelDestinations);

        // --- 3. Accessing Elements ---
        System.out.println("\n--- Accessing Elements ---");
        // getFirst() and getLast() are efficient ways to access the ends.
        String firstCity = travelDestinations.getFirst();
        String lastCity = travelDestinations.getLast();
        System.out.println("First destination (getFirst): " + firstCity);
        System.out.println("Last destination (getLast):   " + lastCity);

        // get(index) can be used, but it's less efficient than in an ArrayList
        // because it has to traverse the list from the beginning or end.
        String thirdCity = travelDestinations.get(2);
        System.out.println("Destination at index 2:   " + thirdCity);


        // --- 4. Removing Elements ---
        System.out.println("\n--- Removing Elements ---");
        // removeFirst() is an efficient way to remove the first element.
        String removedFirst = travelDestinations.removeFirst();
        System.out.println("Removed first element:    " + removedFirst);
        System.out.println("List after removeFirst(): " + travelDestinations);

        // removeLast() is an efficient way to remove the last element.
        String removedLast = travelDestinations.removeLast();
        System.out.println("Removed last element:     " + removedLast);
        System.out.println("List after removeLast():  " + travelDestinations);

        // remove(index) removes the element at a specific position.
        travelDestinations.remove(1);
        System.out.println("List after remove(1):     " + travelDestinations);

        // --- 5. Iterating over the LinkedList ---
        System.out.println("\n--- Iterating over the final list ---");
        for (String destination : travelDestinations) {
            System.out.println("- " + destination);
        }

        System.out.println("\nFinal list size: " + travelDestinations.size());
    }
}