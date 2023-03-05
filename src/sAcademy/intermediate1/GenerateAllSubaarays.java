package intermediate1;

public class GenerateAllSubaarays {


    public static void main(String[] args) {

        int A [] = { 36, 63, 63, 26, 87, 28, 77, 93, 7 };

        System.out.println(solve(A));
    }

    public static int[][] solve(int[] A) {


        int n = A.length;

        int [][] subArray = new int[n][0];

        for (int i = 1; i < n; i++) {

            for (int j = i; j < n; j++) {

                subArray[i][j] = A[i] + A[j-1];

            }
        }
        return subArray;

    }

}
