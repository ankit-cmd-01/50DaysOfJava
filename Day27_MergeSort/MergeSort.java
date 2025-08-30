import java.util.Arrays;

public class MergeSort {

    /**
     * The main recursive method that sorts arr[l..r] using merge().
     * @param arr The array to be sorted.
     * @param l Left index.
     * @param r Right index.
     */
    public static void mergeSort(int[] arr, int l, int r) {
        // Base case: if the array has 1 or 0 elements, it's already sorted.
        if (l < r) {
            // 1. DIVIDE: Find the middle point.
            int m = l + (r - l) / 2;

            // 2. CONQUER: Sort the first and second halves recursively.
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // 3. COMBINE: Merge the sorted halves.
            merge(arr, l, m, r);
        }
    }

    /**
     * Merges two sorted subarrays into one.
     * First subarray is arr[l..m].
     * Second subarray is arr[m+1..r].
     */
    private static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // --- Merge the temporary arrays ---
        int i = 0, j = 0; // Initial indexes of first and second subarrays
        int k = l;        // Initial index of the merged subarray

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Call the sort method.
        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }
}