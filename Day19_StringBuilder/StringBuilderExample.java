public class StringBuilderExample {

    public static void main(String[] args) {
        // 1. Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 2. Append new text to the end of the StringBuilder
        sb.append(" World"); // The StringBuilder now contains "Hello World"
        sb.append("!");      // Now it's "Hello World!"
        System.out.println("After append(): " + sb);

        // 3. Insert text at a specific index
        // Insert "Java " at index 6 (after "Hello ")
        sb.insert(6, "Java ");
        System.out.println("After insert(): " + sb);

        // 4. Delete a part of the text
        // Delete the word "Java " (from index 6 to 11)
        sb.delete(6, 11);
        System.out.println("After delete(): " + sb);

        // 5. Reverse the entire sequence of characters
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        // 6. Convert the StringBuilder back to a standard String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}