package intermediate1;

public class PickFromBothSides {

    public static void main(String[] args) {


        int[] A = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705,
                -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396,
                902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229,
                538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673,
                -336, 141, 711, -747, -132,
                547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};

        int B = 48;

        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        maxSum = sum;

        int i = B - 1;
        int j = n - 1;

        while (i >= 0 && j >= n - B) {
            sum = sum - A[i] + A[j];
            maxSum = Math.max(maxSum, sum);
            i--;
            j--;
        }

        return maxSum;
    }
}