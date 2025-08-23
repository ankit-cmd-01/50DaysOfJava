public class BinarySearch {

    /**
     * Performs a binary search on a sorted array.
     * @param sortedArr The sorted array to search through.
     * @param target The value to search for.
     * @return The index of the target if found, otherwise -1.
     */
    public static int binarySearch(int[] sortedArr, int target) {
        int low = 0;
        int high = sortedArr.length - 1;

        // Continue searching as long as the search space is valid.
        while (low <= high) {
            // Calculate the middle index to avoid potential overflow.
            int mid = low + (high - low) / 2;

            // Case 1: The target is found at the middle.
            if (sortedArr[mid] == target) {
                return mid;
            }

            // Case 2: The target is in the right half of the array.
            if (sortedArr[mid] < target) {
                low = mid + 1;
            }
            // Case 3: The target is in the left half of the array.
            else {
                high = mid - 1;
            }
        }

        // If the loop finishes, the target was not in the array.
        return -1;
    }

    public static void main(String[] args) {
        // The array MUST be sorted for binary search to work.
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int resultIndex = binarySearch(numbers, target);

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}