package intermediat2;

import java.awt.*;
import java.util.HashMap;

public class LongestSubarrayZeroSum {

    public static void main(String[] args) {

        /*
        *   Given an array A of N integers.

                Find the length of the longest subarray in the array which sums to zero.
        * */
    }

    public static int solve(int A[]) {
        int n = A.length;
        int sum = 0;
        int max_Length = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {

            sum += A[i];

            if (sum == 0) {
                max_Length = i + 1;
            }


            Integer value = hm.get(sum);

            if (value != null) {
                max_Length = Math.max(max_Length, i - value);

            }else
                hm.put(sum, i);
        }

        return max_Length;
    }
}
