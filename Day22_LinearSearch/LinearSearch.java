public class LinearSearch {

    /**
     * Performs a linear search to find a target value in an array.
     * @param arr The array to search through.
     * @param target The value to search for.
     * @return The index of the target if found, otherwise -1.
     */
    public static int linearSearch(int[] arr, int target) {
        // Loop through each element of the array.
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the target...
            if (arr[i] == target) {
                // ...return its index immediately.
                return i;
            }
        }
        // If the loop finishes without finding the target, return -1.
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {22, 14, 8, 35, 2, 41, 19};
        int target = 35;

        // Call the search method.
        int resultIndex = linearSearch(numbers, target);

        // Check the result.
        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}