package intermediate1;

public class RangeSumQuery {

    public static void main(String[] args) {

    }

    public static long[] rangeSum(int[] A, int[][] B) {

        int n = A.length;
        int m  = B.length;

        int [] result = new int[m];

        int [] prefix = new int[n];



        long [] result1 =  new long[m];



        for (int i =0; i < n; i++) {

            prefix[i] = prefix[i -1] + A[i];


        }
        for (int i = 0; i < m; i++) {

            int l = B[i][0];
            int r = B[i][1];

            result1[i] = prefix[r] - prefix[l] + A[l];


        }
        return  result1;
    }
}
