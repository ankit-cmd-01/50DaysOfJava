import java.util.Arrays;

public class InsertionSort {

    /**
     * Sorts an array using the Insertion Sort algorithm.
     * @param arr The array to be sorted.
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // The outer loop iterates from the second element (index 1)
        for (int i = 1; i < n; ++i) {
            // The 'key' is the element to be inserted into the sorted portion.
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1] that are greater than the key
               one position to their right to make space for the key. */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Place the key in its correct sorted position.
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Call the sort method.
        insertionSort(numbers);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }
}