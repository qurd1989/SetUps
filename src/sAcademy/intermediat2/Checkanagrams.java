package intermediat2;

import java.util.Arrays;

public class Checkanagrams {

    public static void main(String[] args) {


        String A = "rescue";
        String B = "secure";

        System.out.println(solve(B, A));
    }


    public static int solve(String B, String A) {

        int n1 = A.length();
        int n2 = B.length();

        char [] firstString = A.toCharArray();
        char [] secondtString = A.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondtString);

        for(int i = 0; i < n1; i++) {
            if (firstString[i] == secondtString[i]) {
                return 1;

            }
        }

        return 0;
    }
}
