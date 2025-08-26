import java.util.Arrays;

public class BubbleSort {

    /**
     * Sorts an array using the Bubble Sort algorithm.
     * @param arr The array to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // The outer loop controls the number of passes.
        for (int i = 0; i < n - 1; i++) {
            // The inner loop performs the comparisons and swaps.
            // After each pass 'i', the largest element bubbles up to the end.
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next one...
                if (arr[j] > arr[j + 1]) {
                    // ...swap them.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Call the sort method.
        bubbleSort(numbers);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }
}