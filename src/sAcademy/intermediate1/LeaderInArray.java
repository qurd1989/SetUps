package intermediate1;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {

    public static void main(String[] args) {


    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int L = A[n - 1];
        List<Integer> leaders = new ArrayList<>();
        leaders.add(L);

        // for finding leaders in other elements of the array
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > L) {
                L = A[i];
                leaders.add(L);
            }
        }

        // Convert List<Integer> to int[]
        int[] result = new int[leaders.size()];
        for (int i = 0; i < leaders.size(); i++) {
            result[i] = leaders.get(i);
        }
        return result;
    }
}