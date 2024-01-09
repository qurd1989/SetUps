package array;

public class PalindromicArray {
    public static void main(String[] args) {

    }

    public static int palinArray(int[] a, int n) {

        for (int i =0; i< n; i++){
            if (reverse(a[i])){
                continue;
            }else
                return 0;
        }
        return 1;

    }

    static boolean reverse(int a) {
        int n = a;
        int temp =0;
        int rev = 0;
        while (n > 0){
           temp = n % 10;
           rev = (rev * 10) +temp;
           n /= 10;
        }
        if (rev == a) {
            return true;
        }else
            return false;
    }
}
