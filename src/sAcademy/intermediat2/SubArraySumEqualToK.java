package intermediat2;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySumEqualToK {

    public static void main(String[] args) {

    }

    public int solve(ArrayList<Integer> A, int B) {

        int n = A.size();

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i + 1; i < n; i++) {

                sum += A.get(i);
                if (sum == B) {

                    return sum;
                }

            }
        }
        return -1;
    }


    public int solve1(ArrayList<Integer> A, int B) {
        int n = A.size();
        HashMap<Integer, Integer> hm = new HashMap<>();

        int count = 0; int sum = 0;
        for (int  i = 0; i < n; i++) {
            sum += A.get(i);

            if(sum == B) {
                count++;
            }

            if(hm.get(sum-B) != null) {

                count += hm.get(sum - B);
            }
            if(hm.get(sum) != null) {

                hm.put(sum, hm.get(sum) +1);
            }else {
                hm.put(sum, 1);
            }
        }
        return count;
    }

}
