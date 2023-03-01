package intermediate1;

public class EquilibriumIndexOfArray {

    public static void main(String[] args) {


    }

    public int solve(int[] A) {
        int total_sum = 0;
        int left_sum = 0;

        // Calculate the total sum of the array
        for (int i = 0; i < A.length; i++) {
            total_sum += A[i];
        }

        // Traverse the array and find the equilibrium index
        for (int i = 0; i < A.length; i++) {
            if (left_sum == total_sum - left_sum - A[i]) {
                return i;
            }
            left_sum += A[i];
        }

        // If no equilibrium index is found, return -1
        return -1;
    }
}
