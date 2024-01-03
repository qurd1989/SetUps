package intermediate1;

public class ColumnSum {

    public static void main(String[] args) {

    }
    public  static int[] solve(int [][] A) {

        int n = A.length;
        int m = A[0].length;
        int[] sum = new int[n];



        for (int i = 0; i< n; i++) {


            for (int j= 0; j< m; j++)


            sum[j] += A[i][j];
        }
        return sum;
    }
}
