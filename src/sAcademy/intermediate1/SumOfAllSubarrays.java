package intermediate1;

public class SumOfAllSubarrays {

    public static void main(String[] args) {


    }

    public static long subarraySum(int[] A) {

        int n = A.length;

         int allSubArrys = (n * (n+1)) /2;

         long sum = 0;

         for (int i = 0; i < n; i++) {

             for (int j = i+1;  j < n; i++) {

                 sum += A[i] + A[j];

             }
         }

         return sum;

    }
}
