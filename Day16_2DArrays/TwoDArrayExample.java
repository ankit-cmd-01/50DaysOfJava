public class TwoDArrayExample {

    public static void main(String[] args) {
        // 1. Declare and initialize a 2D array
        // This creates a grid with 3 rows and 4 columns.
        int[][] matrix = new int[3][4];

        // 2. Populate the array using nested loops
        // The outer loop iterates through rows.
        for (int i = 0; i < 3; i++) {
            // The inner loop iterates through columns of the current row.
            for (int j = 0; j < 4; j++) {
                // Assign a value based on row and column index
                matrix[i][j] = i + j;
            }
        }

        // 3. Access a single element
        // Let's get the value at row 1, column 2
        System.out.println("Value at matrix[1][2] is: " + matrix[1][2]);
        System.out.println("------------------------------------");

        // 4. Print the entire 2D array in a grid format
        System.out.println("The entire matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // Print the element, followed by a space
                System.out.print(matrix[i][j] + " ");
            }
            // Move to the next line after printing all columns in a row
            System.out.println();
        }

        // You can also initialize a 2D array with values directly
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones", "Williams"}
        };
        System.out.println("\nDirectly initialized greeting: " + names[0][0] + names[1][0]);
    }
}