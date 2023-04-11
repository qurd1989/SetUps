package intermediat2;

import java.util.HashMap;
import java.util.HashSet;

public class CountSubarrayZeroSum {
    public static void main(String[] args) {

    }

    public int solve(int[] A) {

        int n = A.length;
        int count = 0;
        HashMap<Long, Integer> hs = new HashMap<>();

         long sum = 0;
        int MOD = 1000000007;
        for (int i = 0; i < n; i++) {

            sum += A[i];

            if (sum == 0) {
                count++;
            }

            if (hs.containsKey(sum)) {

                count += hs.get(sum) % MOD;
                hs.put(sum, hs.get(sum) +1);
            }else
                hs.put(sum, 1);
        }

   return count;
    }

}
