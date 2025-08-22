public class TimeAndSpaceComplexity {

    // --- Examples of Time Complexity ---

    /**
     * O(n) - Linear Time Complexity
     * The number of operations grows linearly with the input size 'n'.
     */
    public void linearTime(int[] arr) {
        // We perform a single operation for each element in the array.
        for (int i = 0; i < arr.length; i++) {
            // This is a constant time operation (O(1)).
            System.out.println(arr[i]);
        }
    }

    /**
     * O(n^2) - Quadratic Time Complexity
     * The number of operations grows quadratically with the input size 'n'.
     */
    public void quadraticTime(int[] arr) {
        // For each element, we loop through all elements again.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // This inner operation is performed n*n times.
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    /**
     * O(log n) - Logarithmic Time Complexity
     * The number of operations is cut in half with each step.
     */
    public int logarithmicTime(int[] sortedArr, int target) {
        int low = 0;
        int high = sortedArr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArr[mid] == target) {
                return mid; // Found it!
            } else if (sortedArr[mid] < target) {
                low = mid + 1; // Discard the left half.
            } else {
                high = mid - 1; // Discard the right half.
            }
        }
        return -1; // Not found.
    }

    // --- Examples of Space Complexity ---

    /**
     * O(1) - Constant Space Complexity
     * The amount of memory used does not depend on the input size 'n'.
     */
    public int constantSpace(int[] arr) {
        int sum = 0; // The 'sum' variable uses a fixed amount of memory.
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * O(n) - Linear Space Complexity
     * The amount of memory used grows linearly with the input size 'n'.
     */
    public int[] linearSpace(int[] arr) {
        // We create a new array whose size depends on the input size.
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * 2;
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println("This program illustrates different time and space complexities in code.");
    }
}