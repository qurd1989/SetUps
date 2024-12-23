package gfg160DayChallenge;

public class MaximumProductSubarray {
    public static void main(String[] args) {

    }

    int maxProduct(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0; // Handle edge case: empty array

        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            // Swap max and min when arr[i] is negative
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            // Update max and min product for the current position
            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            // Update the result with the highest product found so far
            result = Math.max(result, max);
        }
        return result;
    }
}