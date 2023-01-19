package Introduction;

public class ClassR17 {

    /*
    *   Write a short Java method that takes an integer n and returns the sum of the
    * squares of all positive integers less than or equal to n.
    *
    * */

    public static void main(String[] args) {

        int n = 5;

        System.out.println(isSquare(n));
    }

    public static  int isSquare(int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {


            sum += i *i;
            System.out.println(sum);

        }
        return sum;

    }
}
