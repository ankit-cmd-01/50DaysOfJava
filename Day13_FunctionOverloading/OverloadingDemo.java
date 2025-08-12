public class OverloadingDemo {

    // Method 1: Adds two integers
    public static int add(int a, int b) {
        System.out.println("Called the method that adds two integers:");
        return a + b;
    }

    // Method 2: Overloaded to add three integers
    public static int add(int a, int b, int c) {
        System.out.println("Called the method that adds three integers:");
        return a + b + c;
    }

    // Method 3: Overloaded to add two doubles
    public static double add(double a, double b) {
        System.out.println("Called the method that adds two doubles:");
        return a + b;
    }

    public static void main(String[] args) {
        // Java automatically chooses the correct method based on the arguments provided.

        int sumOfTwo = add(10, 20);
        System.out.println("Result: " + sumOfTwo);
        System.out.println(); // Adding a blank line for clarity

        int sumOfThree = add(10, 20, 30);
        System.out.println("Result: " + sumOfThree);
        System.out.println();

        double sumOfDoubles = add(7.5, 2.5);
        System.out.println("Result: " + sumOfDoubles);
    }
}