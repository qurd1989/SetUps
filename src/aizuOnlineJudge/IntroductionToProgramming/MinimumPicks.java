package IntroductionToProgramming;

public class MinimumPicks {

    public static void main(String[] args) {


        int [] arr = {-98, -54, -52, 15,  23, -97, 12, -64, 52, 85};
        System.out.println(solve(arr));

    }


    public static int solve(int [] A) {

        int maxEven = 0;
        int minOdd = 1;

        for (int i = 0; i < A.length; i++) {

            if (A[i] > maxEven && A[i] % 2 == 0) {
                maxEven = A[i];

                System.out.println("Maximum of all even numbers = " + maxEven);
            }

        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] < minOdd && A[i] % 2 != 0) {
                 minOdd = A[i];

                System.out.println("Minimum  of all odd numbers = " +minOdd);
            }
        }
        int ans = maxEven - minOdd;

        System.out.println("ans = " + maxEven + "-" + minOdd + " = "  + ans);
        return ans;
    }
    }