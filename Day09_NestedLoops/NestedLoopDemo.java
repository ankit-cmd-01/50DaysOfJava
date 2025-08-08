public class NestedLoopDemo {
    public static void main(String[] args) {
        // The outer loop controls the rows.
        for (int i = 1; i <= 3; i++) {
            // The inner loop controls the columns.
            for (int j = 1; j <= 5; j++) {
                // Print the coordinate, but stay on the same line.
                System.out.print("(" + i + "," + j + ") ");
            }
            // After the inner loop finishes, move to the next line.
            System.out.println();
        }
    }
}