public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // You can change this value for a bigger or smaller triangle

        // The outer loop handles the number of rows.
        for (int i = 1; i <= rows; i++) {
            // The inner loop handles the number of stars in each row.
            for (int j = 1; j <= i; j++) {
                // Print a star followed by a space.
                System.out.print("* ");
            }
            // Move to the next line after all stars for the current row are printed.
            System.out.println();
        }
    }
}