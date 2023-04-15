package intermediat2;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountPairSum {

    public static void main(String[] args) {




    }

    public static int solve(int[] A, int B) {

        int n = A.length;

        Arrays.sort(A);
        int i = 0;
        int j = n-1;
        int count =0;

        while (i < j) {

            if (A[i] + A[j]== B) {
                count++;
            }
        }
        return count;
    }
    public static int solve1(int[] A, int B) {

        int n = A.length;

        int count = 0;
        HashSet<Integer> hm = new HashSet<>();


        for (int i = 0;  i < n; i++) {

            int x = B - A[i];
            if (hm.contains(x)) {
                count++;
            }

            hm.add(A[i]);
            }
        return count;
    }
/*    You are given an array A of N integers and an integer B.
    Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
    Since the answer can be very large, return the remainder after dividing the count with 109+7.*/

    public static int solve12(int[] A, int B) {

        int n = A.length;

        int mod = (int)(1e9) +1;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++ ){

            hm.put(i, hm.getOrDefault(i, 0) +1);

        }

        int ans = 0;
        for (int i= 0; i < n; i++) {
            if (hm.containsKey(i -B)) {
                ans += hm.get(i -B);

                if (i - B ==i) {
                    ans -= 1;

                }
            }
        }

        return ans % mod;
    }
}
