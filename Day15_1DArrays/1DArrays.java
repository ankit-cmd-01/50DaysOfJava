public class ArrayExample {

    public static void main(String[] args) {
        // 1. Declare and initialize an array of integers
        // This creates an array named 'numbers' that can hold 5 integers.
        int[] numbers = new int[5];

        // 2. Assign values to array elements using their index
        // Note: Array indices start from 0!
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // numbers[5] = 60; // This would cause an ArrayIndexOutOfBoundsException!

        // 3. Access and print a single element
        System.out.println("The element at index 2 is: " + numbers[2]); // Output: 30

        System.out.println("--- All elements in the array ---");

        // 4. Loop through the array to print all elements
        // The '.length' property gives the size of the array (which is 5).
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // You can also initialize an array with values directly
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("\nThe first fruit is: " + fruits[0]); // Output: Apple
    }
}