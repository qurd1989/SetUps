package intermediat2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class FactorsSort {
    public static void main(String[] args) {

        int[] A = {6, 8, 9};
        int[] result = solve(A);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findFactors(int A) {
        Set<Integer> factors = new HashSet<>();

        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                factors.add(i);
                if (i != A / i) {
                    factors.add(A / i);
                }
            }
        }

        int[] result = new int[factors.size()];
        int i = 0;
        for (int factor : factors) {
            result[i++] = factor;
        }
        return result;
    }

    public static int[] solve(int[] A) {
        if (A == null || A.length == 0) {
            return new int[0];
        }

        class Pair {
            final int factor;
            final int value;

            Pair(int f, int v) {
                this.factor = f;
                this.value = v;
            }
        }

        int n = A.length;
        Pair[] p = new Pair[n];

        for (int i = 0; i < n; i++) {
            int[] factors = findFactors(A[i]);
            p[i] = new Pair(factors.length, A[i]);
        }

        Arrays.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.factor != o2.factor) {
                    return o1.factor - o2.factor;
                } else {
                    return o1.value - o2.value;
                }
            }
        });

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = p[i].value;
        }
        return result;
    }
}