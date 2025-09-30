import java.util.TreeSet;
import java.util.Iterator;

/**
 * A basic demonstration of the TreeSet class in Java.
 * This program shows how TreeSet automatically stores elements in sorted order
 * and ensures that no duplicate elements are present.
 */
public class TreeSetBasics {

    public static void main(String[] args) {

        // 1. Create a TreeSet
        // We will store a set of programming languages (String).
        // TreeSet will automatically sort the elements alphabetically.
        TreeSet<String> languages = new TreeSet<>();

        // 2. Add elements to the set
        // Notice we are adding them in a non-alphabetical order.
        System.out.println("## Adding elements in random order ##");
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        // Adding a duplicate element - it will be ignored.
        boolean isAdded = languages.add("Python");
        System.out.println("Was the second 'Python' added? " + isAdded); // Will print false

        // 3. Display the TreeSet
        // When you print the set, you'll see the elements are in natural sorted order.
        System.out.println("\nFull TreeSet (elements are automatically sorted):");
        System.out.println(languages); // Output will be [C++, Java, JavaScript, Python]

        // 4. Basic Set Operations
        System.out.println("\n## Basic Set Operations ##");
        // Check if an element exists
        System.out.println("Does the set contain 'Java'? " + languages.contains("Java"));

        // Remove an element
        languages.remove("C++");
        System.out.println("Set after removing 'C++': " + languages);

        // Iterate over the sorted set
        System.out.println("\nIterating over the sorted elements:");
        for (String lang : languages) {
            System.out.println("- " + lang);
        }

        // 5. Special Navigational Methods of TreeSet
        // These methods are unique to sorted sets like TreeSet.
        System.out.println("\n## Navigational Methods ##");

        // Get the first (lowest) element
        System.out.println("First (lowest) element: " + languages.first());

        // Get the last (highest) element
        System.out.println("Last (highest) element: " + languages.last());

        // Find the element GREATER than a given value
        System.out.println("Element higher than 'Java': " + languages.higher("Java")); // Finds JavaScript

        // Find the element LESS than a given value
        System.out.println("Element lower than 'Java': " + languages.lower("Java")); // Returns null (since C++ was removed)
    }
}