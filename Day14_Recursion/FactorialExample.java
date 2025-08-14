public class FactorialExample {

    // This is the recursive method
    public static int factorial(int n) {
        // 1. Base Case: The stopping condition
        if (n <= 1) {
            return 1;
        }
        // 2. Recursive Step: The method calls itself with a smaller input
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result); // Output: The factorial of 5 is 120
    }
}