package intermediate1;

public class ScalarMatrice {

    public static void main(String[] args) {



    }

    public static int[][] solve(int[][] A, int B) {


        int n = A.length;
        int m  = A[0].length;

        int scalarMul[][] = new int[n][m];


        for(int i =0; i < n; i++) {

            for(int j =0; j < m; j++) {

                scalarMul[i][j] = A[i][j] * B;


            }
        }

        return scalarMul;

    }
}


