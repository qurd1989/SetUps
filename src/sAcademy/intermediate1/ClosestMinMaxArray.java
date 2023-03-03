package intermediate1;

public class ClosestMinMaxArray {

    public static void main(String[] args) {


        int [] A = {814, 761, 697, 483, 981};

        System.out.println(solve(A));
    }
    public static int solve(int[] A) {

        if (A.length < 2) {
            return 0;
        }

        int maxVal = A[0];
        int minVal = A[0];

        int max_idx = -1;
        int min_idx = -1;

         int ans = 0;
        for (int  i = 1; i < A.length; i++) {

            if (A[i] > maxVal) {
                maxVal = A[i];
                max_idx =i;

            }
            if (A[i] <minVal) {
                minVal = A[i];
               min_idx =i;
            }

            if (min_idx != -1 && min_idx != -1) {

                int TempInd = Math.abs(max_idx - min_idx) /2;
                if (TempInd > ans)
                ans =TempInd;

            }

        }
        return ans;

    }
}
