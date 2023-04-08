import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfElementQuery {

    public static void main(String[] args) {
    }


    public int[] solve(int[] A, int[] B) {

        int n = A.length;
        int m = B.length;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (freq.containsKey(A[i])) {
                freq.put(A[i], freq.get(A[i]) + 1);
            } else {
                freq.put(A[i], 1);
            }
        }

        ArrayList<Integer> common = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (freq.containsKey(B[i]) && freq.get(B[i]) > 0) {
                common.add(B[i]);
                freq.put(B[i], freq.get(B[i]) - 1);
            }
        }

        if (common.isEmpty()) {
            return new int[0];
        }

        int[] result = new int[common.size()];
        for (int i = 0; i < common.size(); i++) {
            result[i] = common.get(i);
        }

        return result;
    }
}