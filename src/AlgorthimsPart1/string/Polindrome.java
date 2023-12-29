package string;

public class Polindrome {
    public static void main(String[] args) {


        String s = "elmar";

        System.out.println(reverse(s));
        if (reverse(s) == s) {
            System.out.println("IdPoidrome");
        }else
            System.out.println("Not polindrome");

        System.out.println(isPolindrome(s));

        int []arr = {1,24,45,65,676,865,33,2232};

        int n = arr.length;
        int start = 0;
        int result = solve3(arr, n, start);
        System.out.println(result);

    }


    static String reverse(String str){
        int start = 0;
        int end = str.length()-1;
        char []c = str.toCharArray();
        while (start< end){
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }

        return new String(c);
    }


    static boolean isPolindrome(String  s){
        int right = s.length()-1;
        int left = 0;
        char leftChar;
        char rightChar;
        while (left < right){
            leftChar = s.charAt(left);
            rightChar = s.charAt(right);

            if (leftChar == rightChar) {
                left++;
                right--;
            }else
                return false;
        }
        return true;
    }

    static int solve3(int arr[], int  n, int s) {


        return (n==1) ? arr[s] :Math.max(arr[s], solve3(arr, s+1, n-1));
    }
}
