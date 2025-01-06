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
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);
            result = Math.max(result, max);
            System.out.println("max: " + max + " min: " + min + " result: " + result);
        }
        return result;
    }
}