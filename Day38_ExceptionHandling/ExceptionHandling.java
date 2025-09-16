public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("--- Example 1: An exception occurs ---");

        try {
            // 1. The 'try' block: Contains code that might throw an exception.
            System.out.println("Attempting division...");
            int result = 10 / 0; // This will cause an ArithmeticException.
            System.out.println("This message will NOT be printed.");

        } catch (ArithmeticException e) {
            // 2. The 'catch' block: Catches and handles the exception.
            // This block is executed only if an ArithmeticException occurs in the try block.
            System.out.println("Error: Cannot divide by zero!");

        } finally {
            // 3. The 'finally' block: This code is always executed.
            // It runs whether an exception was thrown or not.
            System.out.println("The 'finally' block always runs for cleanup.");
        }

        System.out.println("\nProgram continues executing after the exception was handled.");
        
        System.out.println("\n--- Example 2: No exception occurs ---");
        
        try {
            int result = 10 / 5;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // This block is skipped because no exception occurred.
            System.out.println("This catch block is NOT executed.");
        } finally {
            System.out.println("The 'finally' block runs even without an exception.");
        }
    }
}