package intermediat2;

import javax.imageio.metadata.IIOMetadataFormat;
import javax.imageio.stream.IIOByteBuffer;

public class CheckPalindrome {
    public static void main(String[] args) {


        String A= "naman";
        System.out.println(solve(A));
    }
   public static int solve(String A) {

        int n = A.length();
        if (n <= 1) {
            return 1;
            //it`s palindrome

        }
        if (A.charAt(0) == A.charAt(n-1)) {

            String subString = A.substring(1, n-1);
            return solve(subString);
        }
        return 0;


    }

        }
