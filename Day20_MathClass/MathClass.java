/**
 * A basic program demonstrating common methods from the java.lang.Math class.
 */
public class MathClass {

    public static void main(String[] args) {
        double num1 = 9.0;
        int num2 = -50;
        int a = 15;
        int b = 25;

        // --- Basic Operations ---

        // Math.sqrt() - Finds the square root of a number.
        System.out.println("Square root of " + num1 + " is: " + Math.sqrt(num1));

        // Math.abs() - Finds the absolute (positive) value of a number.
        System.out.println("Absolute value of " + num2 + " is: " + Math.abs(num2));

        // Math.pow() - Calculates a number raised to a power.
        System.out.println("3 to the power of 4 is: " + Math.pow(3, 4));

        // Math.max() and Math.min() - Find the greater or lesser of two numbers.
        System.out.println("The maximum of " + a + " and " + b + " is: " + Math.max(a, b));
        System.out.println("The minimum of " + a + " and " + b + " is: " + Math.min(a, b));


        // --- Rounding and Random Numbers ---

        double decimal = 4.51;
        // Math.round() - Rounds to the nearest whole number.
        System.out.println(decimal + " rounded is: " + Math.round(decimal));

        // Math.ceil() - Always rounds up.
        System.out.println(decimal + " rounded up (ceil) is: " + Math.ceil(decimal));

        // Math.floor() - Always rounds down.
        System.out.println(decimal + " rounded down (floor) is: " + Math.floor(decimal));

        // Math.random() - Generates a random double between 0.0 (inclusive) and 1.0 (exclusive).