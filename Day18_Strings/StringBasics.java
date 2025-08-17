public class StringBasics {

    public static void main(String[] args) {
        // 1. Create a String using a literal
        String message = "Hello, World!";
        System.out.println("Original message: " + message);

        // 2. Get the length of the string
        int len = message.length();
        System.out.println("Length: " + len);

        // 3. Convert to uppercase and lowercase
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        // 4. Concatenate (join) strings with the '+' operator
        String name = "Java";
        String greeting = "Welcome to " + name;
        System.out.println("Greeting: " + greeting);

        // 5. Get a part of the string (a "substring")
        // This gets the characters from index 7 to the end.
        String part = message.substring(7);
        System.out.println("Substring from index 7: " + part);

        // 6. Compare two strings for equality
        String anotherMessage = "Hello, World!";
        boolean areEqual = message.equals(anotherMessage);
        System.out.println("Are the strings equal? " + areEqual);
    }
}