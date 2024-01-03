package intermediate1;

import java.util.Arrays;

public class GenerateAllSubaarays {


    public static void main(String[] args) {

        int[] A = { 36, 63, 63, 26, 87, 28, 77, 93, 7 };

       String str =   Arrays.toString(solve(A));

        System.out.println(str);

    }

    public static int[][] solve(int[] A) {


        int n = A.length;

        int totalbArray = (n * (n+1)) /2;

        int k = 0;


        int [][] AllSubArrays = new int[totalbArray][];

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int size = j -i +1;

                AllSubArrays[k] = new int[size];

                System.arraycopy(A, i, AllSubArrays[k], i - 1, j + 1 - i);

                k++;


            }

        }
        return AllSubArrays;

    }

}
