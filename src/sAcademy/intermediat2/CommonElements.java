package intermediat2;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {

    public static void main(String[] args) {

    }

    public int[] solve(int[] A, int[] B) {

        int n = A.length;
        int m = B.length;

        ArrayList<Integer> alist = new ArrayList<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (!hmap.containsKey(A[i])) {

                hmap.put(A[i], 1);

            }else
                hmap.put(A[i], hmap.get(A[i]) +1);
        }

        for (int i = 0; i < m; i++) {

            if (hmap.containsKey(B[i]) && hmap.get(B[i]) > 0) {

                hmap.put(B[i], hmap.get(B[i]) -1);
                alist.add(B[i]);
            }
        }
        int[] result = new int[alist.size()];
        for (int i= 0; i < alist.size(); i++) {
            result[i] = alist.get(i);
        }

        return result;
    }
}
