package intermediat2;

import java.util.StringTokenizer;

public class ToUpperCase {

    public static void main(String[] args) {

      char[] A = {'S', 'c', 'a', 'L', 'e', 'R', '#', '2', '0', '2', '0'};

        System.out.println(solve(A));

    }

    public static char[] solve(char [] A) {

        int n = A.length;

        StringBuilder sb = new StringBuilder() ;

        char[] result = new char[n] ;

        for (int i =0; i < n; i++) {

            char c =  A[i];
            if (Character.isLowerCase(c)) {

                 result[i] = Character.toUpperCase(c);
            }else
                result [i] = c;

        }
        return result;
    }
}
