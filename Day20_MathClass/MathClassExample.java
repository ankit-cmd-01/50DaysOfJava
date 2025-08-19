public class MathClassExample {

    public static void main(String[] args) {
        // 1. Absolute Value (removes the negative sign)
        int negativeNumber = -25;
        System.out.println("Absolute value of " + negativeNumber + " is: " + Math.abs(negativeNumber));

        // 2. Finding Minimum and Maximum values
        int a = 10, b = 20;
        System.out.println("Minimum value is: " + Math.min(a, b));
        System.out.println("Maximum value is: " + Math.max(a, b));

        // 3. Rounding a number
        double decimal = 3.7;
        System.out.println("Round: " + Math.round(decimal));   // Rounds to the nearest whole number (4)
        System.out.println("Ceil: " + Math.ceil(decimal));    // Rounds up to the nearest whole number (4.0)
        System.out.println("Floor: " + Math.floor(decimal));  // Rounds down to the nearest whole number (3.0)

        // 4. Calculating Powers and Square Roots
        double base = 2.0;
        double exponent = 3.0;
        System.out.println(base + " raised to the power of " + exponent + " is: " + Math.pow(base, exponent));

        double numberForSqrt = 64.0;
        System.out.println("Square root of " + numberForSqrt + " is: " + Math.sqrt(numberForSqrt));

        // 5. Generating a random number
        // This generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
        System.out.println("Random number: " + Math.random());

        // 6. Accessing constants like PI
        System.out.println("The value of PI is: " + Math.PI);
    }
}