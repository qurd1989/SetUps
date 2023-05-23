package advance1;

import java.util.HashMap;

public class SingleNumber {

    public static void main(String[] args) {

    }

    public static int singleNumber(final int[] A) {

        int n = A.length;

        HashMap<Integer, Integer> hp = new HashMap<>();


        for(int i = 0; i < n; i++) {

            if (hp.containsKey(i)) {

                hp.remove(i);

            }else
                hp.put(i, 1);
        }
        return hp.keySet().iterator().next();
    }
}
