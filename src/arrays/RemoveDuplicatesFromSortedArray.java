package arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 3, 4, 5, 6, 6};

        System.out.println(solve1(a));
        int n = a.length;

        int j = 0;
        j = solve(a);
        for (int i = 0; i < j; i++) {

            System.out.print(a[i]);
        }

    }

    private static int solve(int[] A) {

        int n = A.length;
        if (n < 2) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {

            if (A[i] != A[i + 1]) {

                A[j++] = A[i];
            }
        }


        return j;
    }

    private static int[] solve1(int[] A) {

        int n = A.length;

        if (n < 2) {
            return new int[]{0};
        }
        int j = 0;
        int [] result = new int[n];
        for (int i = 0; i <=n; i++) {

            if (A[i] != A[i + 1]) {

              result[j++] = A[i];

            }
        }
        return result;
    }
}
