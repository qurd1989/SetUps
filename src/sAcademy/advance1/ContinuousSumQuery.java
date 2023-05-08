package advance1;

public class ContinuousSumQuery {

    public static void main(String[] args) {

    }
    public int[] solve(int A, int[][] B) {

        int[] ans = new int[A];


        for (int i = 0; i < A; i++) {

            ans[i] = 0;

        }

        int n = B.length;
        for(int i = 0;  i< n; i++) {
            int l = B[i][0] - 1;
            int r = B[i][1] - 1;
            int p = B[i][2];

            for(int j = l;  j<= r; j++) {
                ans[j] = ans[j] + p;

            }
        }

        return ans;
    }

}
