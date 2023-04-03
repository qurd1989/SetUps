package intermediat2;

import java.security.spec.RSAOtherPrimeInfo;

public class ReverseString {


    public static void main(String[] args) {


        String A = "Sttring";

        System.out.println(solve(A));
    }


    public static String solve(String A) {

        int n = A.length();
        char[] ch = A.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static String solve1(String A) {

        int n = A.length();
        char [] ouput = A.toCharArray();
        int left = 0;
        int right = n-1 ;

        while(left < right){

            char temp = ouput[left];
            ouput[left] = ouput[right];
            ouput[right] = temp;
            left++;
            right--;

        }
        return new String(ouput);
    }

}