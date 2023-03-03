package intermediate1;

import java.util.TreeSet;

public class AmazingSubarrays {

    public static void main(String[] args) {

    }

    public static int solve(String A) {
        TreeSet<Character> se = new TreeSet<>();
        se.add('a');
        se.add('e');
        se.add('i');
        se.add('o');
        se.add('u');
        se.add('A');
        se.add('E');
        se.add('I');
        se.add('O');
        se.add('U');

        int ans = 0;


        for (int i = 0; i < A.length(); i++) {

            if (se.contains(A.charAt(i))) {

                ans = (ans + (A.length() - i)) % 10003;

            }
        }
        return ans;
    }
}
