package intermediate1;

public class LinerSearch {

    public static void main(String[] args) {

        int[] A = {1, 2, 2};
        int B = 2;
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int B) {

        int count = 0;

        for(int i = 0; i < A.length; ++i) {

            if(A[i] == B) {

                count++;

            }

        }
        return count;
    }
}

