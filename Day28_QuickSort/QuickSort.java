import java.util.Arrays;

public class QuickSort {

    /**
     * The main recursive method that implements Quick Sort.
     * @param arr The array to be sorted.
     * @param low The starting index.
     * @param high The ending index.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is the partitioning index, arr[pi] is now at the right place.
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after the partition.
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * This method takes the last element as a pivot, places the pivot element
     * at its correct position in the sorted array, and places all smaller
     * elements to the left and all greater elements to the right.
     * @return The index of the pivot.
     */
    private static int partition(int[] arr, int low, int high) {
        // Choose the last element as the pivot.
        int pivot = arr[high];

        // Index of the smaller element.
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot...
            if (arr[j] <= pivot) {
                i++;
                // ...swap arr[i] and arr[j].
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (the pivot) to place the pivot correctly.
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Call the sort method.
        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }
}git init