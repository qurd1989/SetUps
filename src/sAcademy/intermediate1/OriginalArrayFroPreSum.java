package intermediate1;

public class OriginalArrayFroPreSum {

    public static void main(String[] args) {



        int [] preSum = {-2, 4, 1, 5, 2};
        int start = 2;
        int end = 0;
        System.out.println(sumOfSubarray(preSum,start,end));
    }
    public static int sumOfSubarray(int[] prefSum, int start, int end) {
        if (start == 0) {
            return prefSum[end];
        } else {
            return prefSum[end] - prefSum[start - 1];
        }

    }
    }