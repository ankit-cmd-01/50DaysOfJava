import java.util.Map;
import java.util.TreeMap;

/**
 * A basic demonstration of the TreeMap class in Java.
 * This program shows how TreeMap automatically keeps its keys in sorted order
 * and demonstrates its powerful navigational methods.
 */
public class TreeMapBasics {

    public static void main(String[] args) {

        // 1. Create a TreeMap
        // We will map student roll numbers (Integer) to their names (String).
        // TreeMap will automatically sort the entries based on the roll number key.
        TreeMap<Integer, String> studentRoster = new TreeMap<>();

        // 2. Add elements to the map
        // Notice that we are adding them in a non-sorted order.
        System.out.println("## Adding students in random order ##");
        studentRoster.put(105, "Charlie");
        studentRoster.put(102, "Alice");
        studentRoster.put(108, "Eve");
        studentRoster.put(103, "Bob");

        // 3. Display the TreeMap
        // When you print the map, you'll see the keys are in their natural sorted order.
        System.out.println("\nFull TreeMap (keys are automatically sorted):");
        System.out.println(studentRoster); // Output will be {102=Alice, 103=Bob, 105=Charlie, 108=Eve}

        // 4. Basic Map Operations
        System.out.println("\n## Basic Operations ##");
        // Get a value by key
        String student105 = studentRoster.get(105);
        System.out.println("Student with roll number 105: " + student105);

        // Remove an entry
        studentRoster.remove(108);
        System.out.println("Map after removing roll number 108: " + studentRoster);

        // Iterate over the sorted map
        System.out.println("\nIterating over the sorted entries:");
        for (Map.Entry<Integer, String> entry : studentRoster.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 5. Special Navigational Methods of TreeMap
        // These methods are unique to sorted maps like TreeMap.
        System.out.println("\n## Navigational Methods ##");

        // Get the first (lowest) key/entry
        System.out.println("First Entry (lowest roll no): " + studentRoster.firstEntry());

        // Get the last (highest) key/entry
        System.out.println("Last Entry (highest roll no): " + studentRoster.lastEntry());

        // Find the entry with a key GREATER than a given value
        System.out.println("Entry higher than 103: " + studentRoster.higherEntry(103)); // Will find 105

        // Find the entry with a key LESS than a given value
        System.out.println("Entry lower than 103: " + studentRoster.lowerEntry(103)); // Will find 102
    }
}