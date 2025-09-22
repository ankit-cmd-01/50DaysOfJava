import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A basic demonstration of the LinkedHashMap class in Java.
 * This program shows how LinkedHashMap maintains the order in which
 * elements were inserted.
 */
public class LinkedHashMapBasics {

    public static void main(String[] args) {

        // --- 1. Creating a LinkedHashMap (Insertion-Order) ---
        // By default, a LinkedHashMap maintains the order of insertion.
        // We'll map book titles (String) to their publication year (Integer).
        Map<String, Integer> bookShelf = new LinkedHashMap<>();

        System.out.println("--- 2. Adding Elements with put() ---");
        // Elements are added to the map.
        bookShelf.put("The Hobbit", 1937);
        bookShelf.put("Dune", 1965);
        bookShelf.put("Neuromancer", 1984);
        bookShelf.put("A Game of Thrones", 1996);

        System.out.println("LinkedHashMap after adding elements:");
        System.out.println(bookShelf);

        System.out.println("\n--- 3. Iterating (Order is Preserved) ---");
        // When iterating, elements appear in the same order they were inserted.
        // This is the key difference from a regular HashMap.
        System.out.println("Iterating over the entries:");
        for (Map.Entry<String, Integer> entry : bookShelf.entrySet()) {
            System.out.println("Book: " + entry.getKey() + ", Year: " + entry.getValue());
        }

        System.out.println("\n--- 4. Accessing and Updating Elements ---");
        // Accessing an element with get() does not change its order.
        Integer publicationYear = bookShelf.get("Dune");
        System.out.println("Year for Dune: " + publicationYear);

        // Updating an existing key also does not change its order.
        bookShelf.put("The Hobbit", 1936); // Correcting the year
        System.out.println("\nMap after updating 'The Hobbit':");
        System.out.println(bookShelf); // "The Hobbit" remains the first element.

        System.out.println("\n--- 5. Removing an Element ---");
        // Removing an element does not affect the order of the others.
        bookShelf.remove("Neuromancer");
        System.out.println("Map after removing 'Neuromancer':");
        System.out.println(bookShelf);


        System.out.println("\n--- 6. (Advanced) LinkedHashMap with Access-Order ---");
        // You can also configure it to order elements by most recent access.
        // The third constructor argument 'true' enables access-order.
        Map<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put("First", 1);
        accessOrderMap.put("Second", 2);
        accessOrderMap.put("Third", 3);

        System.out.println("Access-order map initial state: " + accessOrderMap);

        // Access the 'Second' element.
        accessOrderMap.get("Second");

        System.out.println("Access-order map after getting 'Second': " + accessOrderMap);
        System.out.println("Notice how 'Second' moved to the end.");
    }
}