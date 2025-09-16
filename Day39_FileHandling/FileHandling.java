import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * A comprehensive example of file handling in Java using the java.nio.file package.
 * This class demonstrates writing, reading, and appending to a file.
 */
public class FileHandling {

    public static void main(String[] args) {
        // Define the path for the file.
        // Paths.get() creates a Path object representing the file location.
        String fileName = "my-sample-file.txt";
        Path filePath = Paths.get(fileName);

        // --- 1. Write to a file ---
        System.out.println("--- Writing to file: " + fileName + " ---");
        writeToFile(filePath, "Hello, World! 🌍\nThis is the first line.\nLet's learn Java file handling.");
        System.out.println("✅ Successfully wrote initial content to the file.");
        System.out.println(); // For spacing

        // --- 2. Read from a file ---
        System.out.println("--- Reading from file: " + fileName + " ---");
        readFromFile(filePath);
        System.out.println(); // For spacing

        // --- 3. Append to a file ---
        System.out.println("--- Appending to file: " + fileName + " ---");
        appendToFile(filePath, "\nThis is new content appended to the file.\nHappy Coding! 😊");
        System.out.println("✅ Successfully appended content to the file.");
        System.out.println(); // For spacing

        // --- 4. Read the file again to see the appended content ---
        System.out.println("--- Reading file again after appending ---");
        readFromFile(filePath);
    }

    /**
     * Writes content to a file. If the file already exists, it will be overwritten.
     *
     * @param path    The path to the file.
     * @param content The string content to write to the file.
     */
    public static void writeToFile(Path path, String content) {
        // Using try-with-resources to ensure the writer is automatically closed.
        // This prevents resource leaks.
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("❌ An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Reads all lines from a file and prints them to the console.
     *
     * @param path The path to the file to be read.
     */
    public static void readFromFile(Path path) {
        // Check if the file exists before trying to read it.
        if (!Files.exists(path)) {
            System.err.println("❌ The file does not exist: " + path);
            return;
        }

        System.out.println("File Content:");
        // Using try-with-resources to ensure the reader is automatically closed.
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            // Read the file line by line until the end is reached (line == null).
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("❌ An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        /*
         * An alternative, more concise way to read all lines into a List:
         *
         * try {
         * List<String> lines = Files.readAllLines(path);
         * lines.forEach(System.out::println);
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         */
    }

    /**
     * Appends content to the end of an existing file. If the file does not exist,
     * it will be created.
     *
     * @param path    The path to the file.
     * @param content The string content to append.
     */
    public static void appendToFile(Path path, String content) {
        // Use try-with-resources with StandardOpenOption.APPEND.
        // CREATE option ensures the file is created if it doesn't exist.
        // APPEND option ensures new content is written to the end of the file.
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("❌ An error occurred while appending to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}