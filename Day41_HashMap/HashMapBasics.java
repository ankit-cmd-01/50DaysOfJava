import java.util.HashMap;
import java.util.Map;

/**
 * A basic demonstration of the HashMap class in Java.
 * This program covers creating a map, adding, accessing, removing,
 * and iterating over key-value pairs.
 */
public class HashMapBasics {

    public static void main(String[] args) {

        // --- 1. Creating a HashMap ---
        // This HashMap will store String keys (e.g., country names)
        // and String values (e.g., their capitals).
        Map<String, String> capitalCities = new HashMap<>();
        System.out.println("Created an empty HashMap: " + capitalCities);

        System.out.println("\n--- 2. Adding Key-Value Pairs using put() ---");
        // The put() method adds a new entry or updates an existing one.
        capitalCities.put("USA", "Washington, D.C.");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("Germany", "Berlin");

        // Adding an existing key will update its value.
        capitalCities.put("Japan", "New Tokyo"); // This updates the previous entry.

        System.out.println("HashMap after adding elements: " + capitalCities);
        System.out.println("Size of the map: " + capitalCities.size());

        System.out.println("\n--- 3. Accessing a Value using get() ---");
        // The get() method retrieves the value for a given key.
        String capitalOfIndia = capitalCities.get("India");
        System.out.println("The capital of India is: " + capitalOfIndia);

        // Trying to access a key that doesn't exist returns null.
        String capitalOfFrance = capitalCities.get("France");
        System.out.println("The capital of France is: " + capitalOfFrance);

        System.out.println("\n--- 4. Checking for Existence ---");
        // Use containsKey() to check if a key is present.
        boolean hasIndia = capitalCities.containsKey("India");
        System.out.println("Does the map contain the key 'India'? " + hasIndia); // true

        // Use containsValue() to check if a value is present.
        boolean hasBerlin = capitalCities.containsValue("Berlin");
        System.out.println("Does the map contain the value 'Berlin'? " + hasBerlin); // true

        System.out.println("\n--- 5. Removing an Entry using remove() ---");
        // The remove() method deletes a key-value pair.
        capitalCities.remove("Germany");
        System.out.println("HashMap after removing Germany: " + capitalCities);

        System.out.println("\n--- 6. Iterating over the HashMap ---");
        // The most common way to iterate is over its entry set.
        System.out.println("Iterating over all entries (key-value pairs):");
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("Country: " + country + ", Capital: " + capital);
        }

        // --- Clearing the HashMap ---
        // capitalCities.clear();
        // System.out.println("\nMap after clearing: " + capitalCities);
    }
}