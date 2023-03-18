package intermediate1;

public class MinimumSwaps {

    public static void main(String[] args) {

    }
    public static int minSwaps(int[] arr, int B) {
        int count = 0;
        int total = 0;

        // Find the total number of elements less than or equal to B in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= B) {
                total++;
            }
        }

        // Find the number of elements less than or equal to B in the first window of size total
        for (int i = 0; i < total; i++) {
            if (arr[i] > B) {
                count++;
            }
        }

        int minSwaps = count;
        // Slide the window of size total across the array and count the number of elements that need to be swapped in each window
        for (int i = total; i < arr.length; i++) {
            if (arr[i - total] > B) {
                count--;
            }
            if (arr[i] > B) {
                count++;
            }
            minSwaps = Math.min(minSwaps, count);
        }

        return minSwaps;
    }
}
