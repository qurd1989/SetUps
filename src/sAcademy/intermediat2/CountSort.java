package intermediat2;

public class CountSort {

    public static void main(String[] args) {


        int[] A = {1,2,3,3,3,2,1,1,5,6,7,78,8,76,67,78,78};


        int[] j = solve(A);
        for (int i = 0; i < j.length; i++) {

            System.out.print(A[i]);
        }


    }

    public static int[] solve(int[] A) {

        int n = A.length;

        int[] output = new int[n];

        int max =A[0];
        for( int i = 0; i < n; i++) {

            if(A[i] > max)
                max = A[i];
        }

        int[] count = new int [max +1];
        for (int i = 0; i <= max; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {

            count[A[i]]++;

        }

        for(int i = 1;  i <= max;  i++) {

            count[i] += count[i -1];
        }

        for ( int j = n-1; j >=0; j--) {

           output[count[A[j]] -1] = A[j];

        }

        return output;

    }

}
