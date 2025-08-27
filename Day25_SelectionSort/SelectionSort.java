import java.util.Arrays;

public class SelectionSort {

    /**
     * Sorts an array using the Selection Sort algorithm.
     * @param arr The array to be sorted.
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // The outer loop moves the boundary of the sorted subarray.
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array.
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // If we find a smaller element, update the minIndex.
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part.
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Call the sort method.
        selectionSort(numbers);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }
}