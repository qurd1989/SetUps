package intermediate1;

public class SubarrayInGivenRange {

    public static void main(String[] args) {

    }


    public  static int[] solve(int[] A, int B, int C) {

        if (A.length < 1) {
            return new int[0];
        }


        if (B >= A.length || C < B) {
            return new int[0];
        }
        if (B == C) {
            return new int[] { A[B] };
        }

        int n =  C -B +1;

        int []subarray  =new int[n];

        for(int i = 0; i < n; i++) {

            subarray[i] = A[B+1];

        }
        return subarray;
    }
}
