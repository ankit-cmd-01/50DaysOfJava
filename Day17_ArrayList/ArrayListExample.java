import java.util.ArrayList; // Don't forget this import!

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings
        // The '<String>' part specifies that this list will only hold String objects.
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements to the ArrayList using the .add() method
        fruits.add("Apple");    // Adds to the end of the list (index 0)
        fruits.add("Banana");   // Adds to the end of the list (index 1)
        fruits.add("Cherry");   // Adds to the end of the list (index 2)

        System.out.println("Initial list: " + fruits);

        // 3. Access an element using the .get(index) method
        // Remember, indexing starts at 0.
        String secondFruit = fruits.get(1);
        System.out.println("The fruit at index 1 is: " + secondFruit);

        // 4. Change an element using the .set(index, value) method
        fruits.set(2, "Mango");
        System.out.println("List after updating index 2: " + fruits);

        // 5. Remove an element using the .remove(index) method
        fruits.remove(0); // Removes "Apple"
        System.out.println("List after removing index 0: " + fruits);

        // 6. Get the current size of the list using the .size() method
        System.out.println("Current size of the list: " + fruits.size());

        // 7. Loop through the ArrayList to print all elements
        System.out.println("--- All remaining fruits ---");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}