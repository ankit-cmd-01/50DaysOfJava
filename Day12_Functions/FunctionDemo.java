public class FunctionDemo {

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // 1. Calling a simple method that just prints a message.
        printWelcomeMessage();

        // 2. Calling a method and passing a value (an argument) to it.
        greetUser("Ankit");

        // 3. Calling a method that returns a value and storing it in a variable.
        int result = add(10, 5);
        System.out.println("The sum from our add method is: " + result);
    }

    // --- Method Definitions ---

    // Method 1: Takes no parameters and returns no value (void).
    public static void printWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method 2: Takes one String parameter named 'name'.
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method 3: Takes two integer parameters and returns an integer value.
    public static int add(int a, int b) {
        int sum = a + b;
        return sum; // Sends the 'sum' value back to where the method was called.
    }
}